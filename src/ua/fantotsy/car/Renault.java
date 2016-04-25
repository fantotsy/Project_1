package ua.fantotsy.car;

public class Renault extends Vehicle{
    public Renault() {
        super(Renault.class.getSimpleName(), 160, 25000, 8);
    }
    public Renault(int maxSpeed, double price, double fuelConsumption){
        super(Renault.class.getSimpleName(), maxSpeed, price, fuelConsumption);
    }
}
