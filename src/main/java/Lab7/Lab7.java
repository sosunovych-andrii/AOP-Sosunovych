package Lab7;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Lab7 {

    // перша форма для введення даних
    public static class FirstForm extends JFrame {
        JTextField countryField1, countryField2, countryField3;
        JTextField populationField1, populationField2, populationField3;
        JButton showMaxButton;

        public FirstForm() {
            setTitle("Введення країн та населення");
            setSize(400, 250);
            setResizable(false);
            setLayout(new GridLayout(4, 2));
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            // створення міток і текстових полів
            JLabel label1 = new JLabel("Країна 1:");
            countryField1 = new JTextField();
            JLabel label2 = new JLabel("Населення 1:");
            populationField1 = new JTextField();

            JLabel label3 = new JLabel("Країна 2:");
            countryField2 = new JTextField();
            JLabel label4 = new JLabel("Населення 2:");
            populationField2 = new JTextField();

            JLabel label5 = new JLabel("Країна 3:");
            countryField3 = new JTextField();
            JLabel label6 = new JLabel("Населення 3:");
            populationField3 = new JTextField();

            showMaxButton = new JButton("Результат");

            // додавання міток і текстових полів до форми
            add(label1);
            add(countryField1);
            add(label2);
            add(populationField1);
            add(label3);
            add(countryField2);
            add(label4);
            add(populationField2);
            add(label5);
            add(countryField3);
            add(label6);
            add(populationField3);
            add(showMaxButton);

            // обробник кнопки
            showMaxButton.addActionListener(e -> {
                {
                    String country1 = countryField1.getText();
                    String country2 = countryField2.getText();
                    String country3 = countryField3.getText();

                    int population1 = Integer.parseInt(populationField1.getText());
                    int population2 = Integer.parseInt(populationField2.getText());
                    int population3 = Integer.parseInt(populationField3.getText());

                    // відкриваємо другу форму для показу країни з найбільшим населенням
                    SecondForm secondForm = new SecondForm(
                            getCountryWithMaxPopulation(
                                    country1,
                                    population1,
                                    country2,
                                    population2,
                                    country3,
                                    population3
                            )
                    );
                    secondForm.setVisible(true);
                }
            });
        }

        // обчислюємо країну з найбільшим населенням
        private String getCountryWithMaxPopulation(String country1, int population1, String country2, int population2, String country3, int population3) {
            int maxPopulation = Math.max(population1, Math.max(population2, population3));
            if (maxPopulation == population1) {
                return country1;
            } else if (maxPopulation == population2) {
                return country2;
            } else {
                return country3;
            }
        }
    }

    // друга форма для відображення країни з найбільшим населенням
    public static class SecondForm extends JFrame {
        JLabel resultLabel;

        public SecondForm(String country) {
            setTitle("Країна з найбільшим населенням");
            setSize(300, 100);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            resultLabel = new JLabel("Країна з найбільшим населенням: " + country);
            add(resultLabel);
        }
    }

    public static void lab_demonstration() {
        FirstForm firstForm = new FirstForm();
        firstForm.setVisible(true);
    }
}
