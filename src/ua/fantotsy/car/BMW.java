package ua.fantotsy.car;

public class Bmw extends Vehicle{
    public Bmw() {
        super(Bmw.class.getSimpleName(), 190, 40000, 10);
    }
    public Bmw(int maxSpeed, double price, double fuelConsumption){
        super(Bmw.class.getSimpleName(), maxSpeed, price, fuelConsumption);
    }
}
