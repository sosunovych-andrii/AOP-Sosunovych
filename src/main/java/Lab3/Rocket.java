package Lab3;

public abstract class Rocket extends Machine {
    int weight;
    int passengers;
    int jetEngines;

    public Rocket(String name, int speed, int weight, int passengers, int jetEngines) {
        super(name, speed);
        this.weight = weight;
        this.passengers = passengers;
        this.jetEngines = jetEngines;
    }
}
