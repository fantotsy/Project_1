package ua.fantotsy.car.comparator;

import ua.fantotsy.car.Vehicle;

import java.util.Comparator;

public class SortedByPrice implements Comparator<Vehicle> {
    public int compare(Vehicle car1, Vehicle car2) {
        double price1 = car1.getPrice();
        double price2 = car2.getPrice();

        if (price1 < price2) {
            return -1;
        } else if (price1 > price2) {
            return 1;
        } else {
            return 0;
        }
    }
}
