package Lab11;
import java.util.Arrays;
import java.util.Random;

public class Lab11 {

    public static int calculateProgression(int a1, int a6, int n) {
        int differenceOfProgression = (a6 - a1) / (6 - 1);
        return (n * (2 * a1 + (n - 1) * differenceOfProgression)) / 2;
    }

    public static int[] sortValues(int xValue, int yValue, int zValue) {
        int[] values = {xValue, yValue, zValue};
        Arrays.sort(values);
        return values;
    }

    public static double sumOfExpression(double epsilon) {
        double sum = 0;
        int k = 1;
        while (true) {
            double ak = (2 * Math.pow(k, 2) + 7) / (8 * k);
            if (ak > epsilon) {
                break;
            }
            sum += ak;
            k++;
        }
        return sum;
    }

    public static int[] fillEvenIndicesWithZeros() {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            arr[i] = (i % 2 == 0) ? 0 : random.nextInt(10);
        }
        return arr;
    }

    public static double maxValueOfFunction(double start, double end) {
        double maxVal = -1000;
        for (double x = start; x < end; x++) {
            double fx = Math.pow(x, 4) - 6 * Math.pow(x, 2) + 8;
            if (fx > maxVal) {
                maxVal = fx;
            }
        }
        return maxVal;
    }
}
