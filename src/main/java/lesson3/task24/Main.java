package main.java.lesson3.task24;

public class Main {
    public static void main(String[] args) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner(true, "Vacuum cleaner ");
        Fridge fridge = new Fridge(true, "Fridge ");
        Oven oven = new Oven(false, "Oven ");

        Appliances[] appliances = {vacuumCleaner, fridge, oven};
        for (Appliances appliance : appliances) {
            System.out.print("The " + appliance.getName() + "is ");
            appliance.printState();
        }
    }
}

