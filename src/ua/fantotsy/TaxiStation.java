package ua.fantotsy;

import ua.fantotsy.car.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TaxiStation {
    List<Vehicle> cars = new ArrayList<Vehicle>();

    public long stationPriceCount() {
        long result = 0;
        for (Vehicle car : cars) {
            result += car.getPrice();
        }
        return result;
    }

    public void sortByFuelConsumption() {

    }
}
