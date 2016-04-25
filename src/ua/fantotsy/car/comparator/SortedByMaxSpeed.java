package ua.fantotsy.car.comparator;

import ua.fantotsy.car.Vehicle;

import java.util.Comparator;

public class SortedByMaxSpeed implements Comparator<Vehicle> {
    public int compare(Vehicle car1, Vehicle car2){
        int maxSpeed1 = car1.getMaxSpeed();
        int maxSpeed2 = car2.getMaxSpeed();

        if(maxSpeed1 < maxSpeed2){
            return -1;
        }
        if(maxSpeed1 > maxSpeed2){
            return 1;
        }
        return 0;
    }
}
