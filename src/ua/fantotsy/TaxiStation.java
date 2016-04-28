package ua.fantotsy;

import ua.fantotsy.car.Vehicle;
import ua.fantotsy.car.comparator.SortedByFuelConsumption;

import java.util.ArrayList;
import java.util.List;

public class TaxiStation {
    List<Vehicle> cars = new ArrayList<Vehicle>();

    public TaxiStation() {

    }

    public void addCar(Vehicle car) {
        if (car.isCanBeAdded()) {
            cars.add(car);
        }
    }

    public void removeCar(Vehicle car) {
        cars.remove(car);
    }

    public long stationPriceCount() {
        long result = 0;
        for (Vehicle car : cars) {
            result += car.getPrice();
        }
        return result;
    }

    public void sortByFuelConsumption() {
        cars.sort(new SortedByFuelConsumption());
    }

    public List<Vehicle> findCarsByMaxSpeed(int lowerSpeed, int upperSpeed) {
        List<Vehicle> result = new ArrayList<Vehicle>();
        for (Vehicle car : cars) {
            if (car.getMaxSpeed() >= lowerSpeed && car.getMaxSpeed() <= upperSpeed) {
                result.add(car);
            }
        }
        return result;
    }

    public void getAllCarsInfo() {
        for (Vehicle car : cars) {
            System.out.println(car);
        }
    }

}
