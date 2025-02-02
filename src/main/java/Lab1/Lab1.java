package Lab1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lab1 {

    public static void calculateProgression() {
        System.out.println("TASK 1");

        int a1 = 1;
        int a6 = 11;
        int differenceOfProgression = (a6 - a1) / (a6 - 1);

        int n = 20;
        int sumOfProgression = (n / 2) * (2 * a1 + (n - 1) * differenceOfProgression);

        System.out.println("Difference of progression: " + differenceOfProgression);
        System.out.println("Sum of twenty values of progression: " + sumOfProgression);
    }

    public static void sortValues() {
        System.out.println("\nTASK 2");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int xValue = scanner.nextInt();
        int yValue = scanner.nextInt();
        int zValue = scanner.nextInt();

        if (xValue > yValue) {
            int temp = xValue;
            xValue = yValue;
            yValue = temp;
        }
        if (yValue > zValue) {
            int temp = yValue;
            yValue = zValue;
            zValue = temp;
        }
        if (xValue > yValue) {
            int temp = xValue;
            xValue = yValue;
            yValue = temp;
        }
        System.out.println("Sorted values: " + xValue + " " + yValue + " " + zValue);
    }

    public static void sumOfExpression() {
        System.out.println("\nTASK 3");
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter k and epsilon values: ");
        int k = scanner.nextInt();
        int epsilon = scanner.nextInt();

        while (sum <= epsilon) {
            sum += (2 * k * k + 7) / (8 * k);
        }

        System.out.println("Sum: " + sum);
    }

    public static void maxValueOfFunction() {
        System.out.println("\nTASK 4");

        int[] arr = new int[12];
        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = random.nextInt(10);
            }
        }
        System.out.println("Array with zeros at even elements: " + Arrays.toString(arr));
    }

    public static void fillEvenIndicesWithZeros() {
        System.out.println("\nTASK 5");
        double start = -1;
        double end = 3;

        double maxVal = -1000;

        for (double x = start; x < end; x++) {
            double fx = Math.pow(x, 4) - 6 * Math.pow(x, 2) + 8;
            if (fx > maxVal) {
                maxVal = fx;
            }
        }
        System.out.println("Max value: " + maxVal);
    }

    public static void lab_info() {
        calculateProgression();
        sortValues();
        sumOfExpression();
        maxValueOfFunction();
        fillEvenIndicesWithZeros();
    }
}
