package ua.fantotsy.car.comparator;

import ua.fantotsy.car.Vehicle;

import java.util.Comparator;

public class SortedByFuelConsumption implements Comparator<Vehicle> {
    public int compare(Vehicle car1, Vehicle car2) {
        int fuelConsumption1 = car1.getFuelConsumption();
        int fuelConsumption2 = car2.getFuelConsumption();

        if (fuelConsumption1 < fuelConsumption2) {
            return -1;
        } else if (fuelConsumption1 > fuelConsumption2) {
            return 1;
        } else {
            return 0;
        }
    }
}