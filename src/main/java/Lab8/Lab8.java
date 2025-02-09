package Lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class Lab8 extends JFrame {
    JTextField textField;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem findMaxItem, findMinItem, clearFieldItem;

    public Lab8() {
        setTitle("Lab8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(220, 200);
        setLocationRelativeTo(null);
        setResizable(false);

        // додаємо поле для вводу
        textField = new JTextField();
        add(textField, BorderLayout.SOUTH);

        // створюєм меню
        menuBar = new JMenuBar();
        menu = new JMenu("Меню");

        // створюємо піпдункти
        findMaxItem = new JMenuItem("Знайти максимум");
        findMinItem = new JMenuItem("Знайти мінімум");
        clearFieldItem = new JMenuItem("Очистити поле");

        // додаємо гарячі клавіші
        findMaxItem.setAccelerator(KeyStroke.getKeyStroke('Q', InputEvent.CTRL_DOWN_MASK));
        findMinItem.setAccelerator(KeyStroke.getKeyStroke('W', InputEvent.CTRL_DOWN_MASK));
        clearFieldItem.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_DOWN_MASK));

        // додаємо обробники подій
        findMaxItem.addActionListener(e -> findMax());
        findMinItem.addActionListener(e -> findMin());
        clearFieldItem.addActionListener(e -> clearField());

        // додаємо менюшку
        menu.add(findMaxItem);
        menu.add(findMinItem);
        menu.add(clearFieldItem);
        menuBar.add(menu);
        add(menuBar, BorderLayout.NORTH);
    }

    private void findMax() {
        String input = textField.getText();
        int[] numbers = parseNumbers(input);

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        JOptionPane.showMessageDialog(this,
                "Максимальний елемент: " + max, "Результат", JOptionPane.INFORMATION_MESSAGE);
    }

    private void findMin() {
        String input = textField.getText();
        int[] numbers = parseNumbers(input);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        JOptionPane.showMessageDialog(this,
                "Мінімальний елемент: " + min, "Результат", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearField() {
        textField.setText("");
    }

    // робимо парсинг введеного рядка у масив чисел
    private int[] parseNumbers(String input) {
        String[] arr = input.split(",");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i].trim());
        }
        return numbers;
    }

    public static void lab_demonstration() {
        Lab8 frame = new Lab8();
        frame.setVisible(true);
    }
}
