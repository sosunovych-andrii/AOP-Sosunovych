package Lab9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Lab9 extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JTextField nameField;
    private JTextField groupField;
    private JTextField subjectField;
    private JTextField gradeField;

    private Connection conn;

    public Lab9() {
        setTitle("Журнал студентів");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        model = new DefaultTableModel(new String[]{"ID", "Ім’я", "Група", "Предмет", "Оцінка"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel inputPanel = new JPanel(new GridLayout(2, 5));
        nameField = new JTextField();
        groupField = new JTextField();
        subjectField = new JTextField();
        gradeField = new JTextField();

        inputPanel.add(new JLabel("Ім’я"));
        inputPanel.add(new JLabel("Група"));
        inputPanel.add(new JLabel("Предмет"));
        inputPanel.add(new JLabel("Оцінка"));
        inputPanel.add(new JLabel(""));

        inputPanel.add(nameField);
        inputPanel.add(groupField);
        inputPanel.add(subjectField);
        inputPanel.add(gradeField);

        JButton addButton = new JButton("Додати");
        JButton deleteButton = new JButton("Видалити");
        inputPanel.add(addButton);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(deleteButton);

        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);

        connectToDatabase();
        refreshTable();

        addButton.addActionListener(e -> {
            String name = nameField.getText();
            String group = groupField.getText();
            String subject = subjectField.getText();
            int grade = Integer.parseInt(gradeField.getText());;

            addStudent(name, group, subject, grade);
            clearFields();
            refreshTable();
        });

        deleteButton.addActionListener(e -> {
            int selected = table.getSelectedRow();
            if (selected != -1) {
                int id = (int) model.getValueAt(selected, 0);
                deleteStudent(id);
                refreshTable();
            } else {
                JOptionPane.showMessageDialog(this, "Виберіть запис для видалення!");
            }
        });
    }

    private void connectToDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:db.sqlite");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addStudent(String name, String group, String subject, int grade) {
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO student_journal (name, group_name, subject, grade) VALUES (?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, group);
            ps.setString(3, subject);
            ps.setInt(4, grade);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteStudent(int id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM student_journal WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void refreshTable() {
        model.setRowCount(0);
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student_journal");
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("group_name"),
                        rs.getString("subject"),
                        rs.getInt("grade")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        nameField.setText("");
        groupField.setText("");
        subjectField.setText("");
        gradeField.setText("");
    }

    public static void lab_demonstration() {
        Lab9 frame = new Lab9();
        frame.setVisible(true);
    }
}
