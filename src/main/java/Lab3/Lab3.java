package Lab3;

public class Lab3 {
    public static void lab_demonstration() {
        ResearchRocket researchRocket = new
                ResearchRocket("Black Brant", 10500, 2, 0,2);

        System.out.println("Information about Research Rocket");
        researchRocket.printVehicleName();
        System.out.println("Speed km/h: " + researchRocket.getSpeed());
        System.out.println("Weight in tons: " + researchRocket.getWeight());
        System.out.println("Amount of passengers: " + researchRocket.getPassengers());
        System.out.println("Amount of jet engines: " + researchRocket.getJetEngines());


        SatelliteRocket satelliteRocket = new
                SatelliteRocket("Falcon 9", 28000, 500, 7, 10);

        System.out.println("\nInformation about Satellite Rocket");
        satelliteRocket.printVehicleName();
        System.out.println("Speed km/h: " + satelliteRocket.getSpeed());
        System.out.println("Weight in tons: " + satelliteRocket.getWeight());
        System.out.println("Amount of passengers: " + satelliteRocket.getPassengers());
        System.out.println("Amount of jet engines: " + researchRocket.getJetEngines());
    }
}
