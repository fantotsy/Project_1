package ua.fantotsy.car;

public class Audi extends Vehicle{
    public Audi() {
        super(Audi.class.getSimpleName(), 180, 30000, 9);
    }
    public Audi(int maxSpeed, double price, double fuelConsumption){
        super(Audi.class.getSimpleName(), maxSpeed, price, fuelConsumption);
    }
}
