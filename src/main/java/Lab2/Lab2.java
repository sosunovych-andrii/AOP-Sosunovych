package Lab2;


public class Lab2 {


    static class Parallelogram {
        int a;
        int b;
        int angle;

        public Parallelogram(int a, int b, int angle) {
            this.a = a;
            this.b = b;
            this.angle = angle;
        }

        public double area() {
            return a * b * Math.sin(Math.toRadians(angle));
        }

        public double height() {
            return area() / a;
        }

        public double firstDiagonal() {
            return (
                    Math.sqrt(
                            Math.pow(a, 2) + Math.pow(b, 2) +
                                    2 * a * b * Math.cos(Math.toRadians(angle))
                    )
            );
        }

        public double secondDiagonal() {
            return (
                    Math.sqrt(
                            Math.pow(a, 2) + Math.pow(b, 2) -
                                    2 * a * b * Math.cos(Math.toRadians(angle))
                    )
            );
        }
    }


    public static void lab_demonstration() {
        Parallelogram parallelogram = new Parallelogram(4, 6, 60);
        System.out.println("Height is: " + parallelogram.height());
        System.out.println("First diagonal is: " + parallelogram.firstDiagonal());
        System.out.println("Second diagonal is: " + parallelogram.secondDiagonal());
    }
}
