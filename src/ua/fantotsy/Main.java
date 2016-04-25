package ua.fantotsy;

import ua.fantotsy.car.Audi;
import ua.fantotsy.car.BMW;
import ua.fantotsy.car.Renault;

public class Main {

    public static void main(String[] args) {
        TaxiStation station = new TaxiStation();
        station.addCar(new Audi());
        station.addCar(new BMW());
        station.addCar(new Renault());

        station.getAllCarsInfo();
        station.sortByFuelConsumption();
        station.getAllCarsInfo();

        System.out.println(station.findCarsByMaxSpeed(160,185));
    }
}
