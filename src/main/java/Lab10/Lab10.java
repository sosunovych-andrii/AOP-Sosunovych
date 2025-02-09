package Lab10;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Lab10 extends JFrame {
    // оголошення текстових полів і міток
    JTextArea inputTextArea;
    JTextArea outputTextArea;
    JLabel outputLabel;
    JLabel inputLabel;

        public Lab10() {
        setTitle("Lab10");
        setSize(350, 175);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));

        // ініціалізація текстових полів
        inputTextArea = new JTextArea();
        inputTextArea.setEditable(false);
        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);

        // Ініціалізація ярликів
        inputLabel = new JLabel("Вміст файлу: INPUT.txt");
        outputLabel = new JLabel("Вміст файлу: OUTPUT.txt");

        // додавання текстових полів та міток до вікна
        add(inputLabel);
        add(outputLabel);
        add(inputTextArea);
        add(outputTextArea);

        // обробка тексту
        processText();
    }

    private void processText() {
        try {
            // читання з INPUT.txt
            BufferedReader reader = new BufferedReader(new FileReader("INPUT.txt"));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            inputTextArea.setText(content.toString());

            // заміна приголосних
            String consonants = "[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]";
            String modifiedContent = content.toString().replaceAll(consonants, "*");
            outputTextArea.setText(modifiedContent);

            // запис у OUTPUT.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("OUTPUT.txt"));
            writer.write(modifiedContent);
            writer.close();

            // гіпотетичні помилки
        } catch (IOException e) {
            inputTextArea.setText("Помилка роботи з файлом: " + e.getMessage());
            outputTextArea.setText("Помилка роботи з файлом: " + e.getMessage());
        }
    }

    public static void lab_demonstration() {
        Lab10 frame = new Lab10();
        frame.setVisible(true);
    }
}
