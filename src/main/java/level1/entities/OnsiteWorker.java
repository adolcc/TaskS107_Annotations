package level1.entities;

public class OnsiteWorker extends Worker {

    private static double gasolineCost = 18.0;

    public OnsiteWorker(String name, String lastName, double hourlyRate) {

        super(name, lastName, hourlyRate);

    }

    @Override
    public double calculateSalary(int hoursWorked) {

        return super.calculateSalary(hoursWorked) + gasolineCost;

    }

    public static void setGasolineCost(double newGasolineCost) {

        gasolineCost = newGasolineCost;

    }

    @Deprecated
    public void checkVehicleStatus() {

        System.out.println(getName() + " " + getLastName() + " is an onsite worker.");

        System.out.println("Checking basic vehicle status (deprecated functionality).");

    }
}