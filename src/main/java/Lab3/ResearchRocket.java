package Lab3;

public class ResearchRocket extends Rocket {

    public ResearchRocket(String name, int speed, int weight, int passengers, int jetEngines) {
        super(name, speed, weight, passengers, jetEngines);
    }

    @Override
    public void printVehicleName() {
        System.out.println("Research Rocket: " + this.name);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getPassengers() {
        return this.passengers;
    }

    @Override
    public int getJetEngines() {
        return this.jetEngines;
    }
}
