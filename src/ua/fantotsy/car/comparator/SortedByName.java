/* project TaxiStation
 *
 * class SortedByName implements Comparator<Vehicle>
 *
 * fantotsy ©
 */

package ua.fantotsy.car.comparator;

import ua.fantotsy.car.Vehicle;

import java.util.Comparator;

public class SortedByName implements Comparator<Vehicle> {
    public int compare(Vehicle car1, Vehicle car2) {
        String name1 = car1.getName();
        String name2 = car2.getName();

        return name1.compareTo(name2);
    }
}
