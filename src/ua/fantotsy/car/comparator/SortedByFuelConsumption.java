/* project TaxiStation
 *
 * class SortedByFuelConsumption implements Comparator<Vehicle>
 *
 * fantotsy ©
 */

package ua.fantotsy.car.comparator;

import ua.fantotsy.car.Vehicle;

import java.util.Comparator;

public class SortedByFuelConsumption implements Comparator<Vehicle> {
    public int compare(Vehicle car1, Vehicle car2) {
        double fuelConsumption1 = car1.getFuelConsumption();
        double fuelConsumption2 = car2.getFuelConsumption();

        double eps = 1e-5;

        if (Math.abs(fuelConsumption1 - fuelConsumption2) < eps) {
            return 0;
        } else if (fuelConsumption1 < fuelConsumption2) {
            return -1;
        } else {
            return 1;
        }
    }
}