package ua.fantotsy.car.exception;

public class InvalidFuelConsumptionException extends Exception {
    private double fuelConsumption;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public InvalidFuelConsumptionException(String message, double fuelConsumption){
        super(message);
        this.fuelConsumption = fuelConsumption;
    }
}
