package level1.entities;

import level1.common.SalaryCalculable;

public class Worker implements SalaryCalculable {
    private String name;
    private String lastName;
    protected double hourlyRate;

    public Worker(String name, String lastName, double hourlyRate) {
        this.name = name;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;

    }

}