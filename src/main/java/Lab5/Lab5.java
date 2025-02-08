package Lab5;

import javax.swing.*;
import java.awt.*;

public class Lab5 {
    public static void lab_demonstration() {
        JFrame frame = new JFrame("Lab 5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // встановлення картинки
        ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\JavaLabs\\AOP-Sosunovych\\src\\main\\java\\Lab5\\img.png");
        JLabel currency = new JLabel(icon);
        currency.setBounds(460, 20, icon.getIconWidth(), icon.getIconHeight());
        frame.add(currency);

        // встановлення мітки конвертації валют
        JLabel currencyConversion = new JLabel("Конвертація валют");
        currencyConversion.setForeground(Color.BLUE);
        currencyConversion.setFont(new Font("Times New Roman", Font.BOLD, 20));
        currencyConversion.setBounds(175, 20, 200, 20);
        frame.add(currencyConversion);

        // встановлення мітки назви валют
        JLabel nameOfCurrency = new JLabel("Назва валюти");
        nameOfCurrency.setForeground(Color.BLACK);
        nameOfCurrency.setFont(new Font("Times New Roman", Font.BOLD, 15));
        nameOfCurrency.setBounds(50, 100, 100, 15);
        frame.add(nameOfCurrency);

        // встановлення поля для вводу
        JTextField inputField = new JTextField();
        inputField.setBounds(160, 100, 200, 20);
        frame.add(inputField);

        // встановлення кнопки для додаткової інфи
        JButton button = new JButton("?");
        button.setBounds(360, 100, 20, 20);
        button.setBackground(Color.CYAN);
        button.setForeground(Color.BLACK);
        frame.add(button);

        // встановленн мітки символьного коду
        JLabel symbolCode = new JLabel("Cимвольний код:");
        symbolCode.setForeground(Color.BLACK);
        symbolCode.setFont(new Font("Times New Roman", Font.BOLD, 15));
        symbolCode.setBounds(50, 150, 125, 15);
        frame.add(symbolCode);

        // встановлення поля для вводу
        JTextField inputField2 = new JTextField();
        inputField2.setBounds(185, 150, 50, 20);
        frame.add(inputField2);

        // встановлення мітки для курсу валют
        JLabel courseOfCurrency = new JLabel("Курс валюти:");
        courseOfCurrency.setForeground(Color.BLACK);
        courseOfCurrency.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        courseOfCurrency.setBounds(50, 250, 100, 15);
        frame.add(courseOfCurrency);

        // встановлення панельки для радіобатонів
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(160, 250, 250, 150);

        // створення радіобатонів
        JRadioButton radioButton1 = new JRadioButton("вводиться вручну");
        JRadioButton radioButton2 = new JRadioButton("завантажується з інтернету");
        JRadioButton radioButton3 = new JRadioButton("пов'язаний з курсом іншої");
        JRadioButton radioButton4 = new JRadioButton("розраховується за формулою");

        // задання шрифтів і бекграунду для радіобатонів
        radioButton1.setFont(new Font("Arial", Font.PLAIN, 15));
        radioButton2.setFont(new Font("Arial", Font.PLAIN, 15));
        radioButton3.setFont(new Font("Arial", Font.PLAIN, 15));
        radioButton4.setFont(new Font("Arial", Font.PLAIN, 15));
        radioButton1.setBackground(Color.LIGHT_GRAY);
        radioButton2.setBackground(Color.LIGHT_GRAY);
        radioButton3.setBackground(Color.LIGHT_GRAY);
        radioButton4.setBackground(Color.LIGHT_GRAY);

        // додавання радіобатонів до групи
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);

        // встановлення позицій для радіобатонів
        radioButton1.setBounds(10, 20, 250, 15);
        radioButton2.setBounds(10, 50, 250, 15);
        radioButton3.setBounds(10, 80, 250, 15);
        radioButton4.setBounds(10, 110, 250, 15);

        // додавання радіобатонів до панелі
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(radioButton4);

        // додавання панелі до вікна
        frame.add(panel);

        // встановлення батона продовжити
        JButton continueButton = new JButton("Продовжити");
        continueButton.setForeground(Color.BLACK);
        continueButton.setBackground(Color.GRAY);
        continueButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        continueButton.setBounds(frame.getWidth() - 190, frame.getHeight() - 150, 170, 20);
        frame.add(continueButton);

        // встановлення батону параметри
        JButton parameters = new JButton("Параметри");
        parameters.setForeground(Color.BLUE);
        parameters.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        parameters.setBounds(20, frame.getHeight() - 90, 120, 15);
        frame.add(parameters);

        frame.setVisible(true);
    }
}
