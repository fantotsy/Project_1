/* project TaxiStation
 *
 * class TaxiStation
 *
 * fantotsy ©
 */

package ua.fantotsy;

import ua.fantotsy.car.Vehicle;
import ua.fantotsy.car.comparator.SortedByFuelConsumption;
import ua.fantotsy.car.comparator.SortedByMaxSpeed;
import ua.fantotsy.car.comparator.SortedByName;
import ua.fantotsy.car.comparator.SortedByPrice;

import java.util.ArrayList;
import java.util.List;

public class TaxiStation {
    private List<Vehicle> cars;

    public TaxiStation() {
        cars = new ArrayList<Vehicle>();
    }

    public void addCar(Vehicle car) {
        cars.add(car);
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

    public void sortByParameter(String parameter) {
        switch (parameter) {
            case "fuelConsumption":
                cars.sort(new SortedByFuelConsumption());
                break;
            case "maxSpeed":
                cars.sort(new SortedByMaxSpeed());
                break;
            case "name":
                cars.sort(new SortedByName());
                break;
            case "price":
                cars.sort(new SortedByPrice());
                break;
            default:
        }
    }

    public List<Vehicle> findCarsByMaxSpeed(int lowerSpeed, int upperSpeed) {
        List<Vehicle> result = new ArrayList<Vehicle>();
        for (Vehicle car : cars) {
            if ((car.getMaxSpeed() >= lowerSpeed) && (car.getMaxSpeed() <= upperSpeed)) {
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
