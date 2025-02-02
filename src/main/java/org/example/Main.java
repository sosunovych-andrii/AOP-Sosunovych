package org.example;
import Lab1.Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lab");
        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                Lab1.lab_info();
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
