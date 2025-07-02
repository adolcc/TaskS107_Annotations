package level1.entities;

public class OnlineWorker extends Worker {

    private static final double INTERNET_FLAT_RATE = 28.0;

    public OnlineWorker(String name, String lastName, double hourlyRate) {

        super(name, lastName, hourlyRate);

    }

    @Override
    public double calculateSalary(int hoursWorked) {

        return super.calculateSalary(hoursWorked) + INTERNET_FLAT_RATE;

    }

    @Deprecated
    public void displayInternetDetails() {

        System.out.println(getName() + " " + getLastName() + " is an online worker.");

        System.out.println("Current Internet Flat Rate: $" + INTERNET_FLAT_RATE);

    }

}