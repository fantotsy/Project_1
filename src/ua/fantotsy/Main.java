package ua.fantotsy;

import ua.fantotsy.car.Audi;
import ua.fantotsy.car.Bmw;
import ua.fantotsy.car.Renault;

public class Main {

    public static void main(String[] args) {
        TaxiStation station = new TaxiStation();
        station.addCar(new Audi());
        station.addCar(new Bmw());
        station.addCar(new Renault());
        station.addCar(new Bmw(220, 50000, 14.5));

        station.getAllCarsInfo();
        station.sortByFuelConsumption();
        station.getAllCarsInfo();

        System.out.println(station.findCarsByMaxSpeed(160,185));
    }
}
