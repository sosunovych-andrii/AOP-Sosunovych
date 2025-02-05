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
            return this.a * this.b * Math.sin(Math.toRadians(this.angle));
        }

        public double getHeight() {
            return this.area() / this.a;
        }

        public double firstDiagonal() {
            return (
                    Math.sqrt(
                            Math.pow(this.a, 2) + Math.pow(this.b, 2) +
                                    2 * this.a * this.b * Math.cos(Math.toRadians(this.angle))
                    )
            );
        }

        public double secondDiagonal() {
            return (
                    Math.sqrt(
                            Math.pow(this.a, 2) + Math.pow(this.b, 2) -
                                    2 * this.a * this.b * Math.cos(Math.toRadians(this.angle))
                    )
            );
        }
    }


    public static void lab_demonstration() {
        Parallelogram parallelogram = new Parallelogram(4, 6, 60);
        System.out.println("Height is: " + parallelogram.getHeight());
        System.out.println("First diagonal is: " + parallelogram.firstDiagonal());
        System.out.println("Second diagonal is: " + parallelogram.secondDiagonal());
    }
}
