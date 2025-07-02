package level1;

import level1.entities.OnlineWorker;

import level1.entities.OnsiteWorker;

import level1.common.SalaryCalculable;

public class Runner {

    @SuppressWarnings("deprecation")

    public void runLevel1Exercises() {

        System.out.println("--- Exercise 1: Salary Calculation and @Override ---");

        OnlineWorker onlineWorker = new OnlineWorker("Adolfo", "Caicaguare", 32.0);

        System.out.println("Online Worker Salary for " + onlineWorker.getName()

                + " " + onlineWorker.getLastName() + ": $" + onlineWorker.calculateSalary(160));

        OnsiteWorker onsiteWorker = new OnsiteWorker("Pepe", "Perez", 20.0);

        System.out.println("Onsite Worker Salary for " + onsiteWorker.getName()

                + " " + onsiteWorker.getLastName() + ": $" + onsiteWorker.calculateSalary(160));

        System.out.println("\n--- Demonstrating static attribute change (gasoline) ---");

        OnsiteWorker.setGasolineCost(40.0);

        System.out.println("Updated Onsite Worker Salary for " + onsiteWorker.getName()

                + " " + onsiteWorker.getLastName() + ": $" + onsiteWorker.calculateSalary(160));

        System.out.println("\n--- Demonstrating SalaryCalculable interface usage ---");

        SalaryCalculable genericWorker1 = new OnlineWorker("Laura", "Diaz", 30.0);

        SalaryCalculable genericWorker2 = new OnsiteWorker("Pedro", "Lopez", 22.0);

        System.out.println("Generic Worker 1 Salary (Online): $" + genericWorker1.calculateSalary(150));

        System.out.println("Generic Worker 2 Salary (Onsite): $" + genericWorker2.calculateSalary(170));

        System.out.println("\n--- Exercise 2: Deprecated Methods Demonstration ---");

        System.out.println("Invoking deprecated methods (warnings suppressed by " +
                "@SuppressWarnings(\"deprecation\") on this method):");

        OnlineWorker specificOnlineWorker = new OnlineWorker("Marta", "Lopez", 28.0);

        specificOnlineWorker.displayInternetDetails();

        OnsiteWorker specificOnsiteWorker = new OnsiteWorker("Luis", "Fernandez", 21.0);

        specificOnsiteWorker.checkVehicleStatus();

        System.out.println("\n--- End of Level 1 Demonstrations ---");

    }

}