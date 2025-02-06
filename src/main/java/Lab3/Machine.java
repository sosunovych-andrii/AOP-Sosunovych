package Lab3;

public abstract class Machine implements Run {
    public static final int MIN_SPEED = 0;
    public static final int MAX_SPEED = 30000;
    public static final int MIN_PASSENGERS = 0;
    public static final int MAX_PASSENGERS = 10;
    String name;
    int speed;

    public Machine(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void printVehicleName() {
        System.out.println("Name of Machine: " + this.name);
    }
}
