package ua.fantotsy.car;

import ua.fantotsy.car.exception.*;

abstract public class Vehicle {
    private boolean canBeAdded = true;

    public boolean isCanBeAdded() {
        return canBeAdded;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidCarParameterException {
        if (name == "") {
            throw new InvalidNameException("The name cannot be empty");
        }
        this.name = name;
    }

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws InvalidCarParameterException {
        if (maxSpeed <= 0) {
            throw new InvalidMaxSpeedException("The maximal speed must be above zero");
        }
        this.maxSpeed = maxSpeed;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidCarParameterException {
        if (price < 5000) {
            throw new InvalidPriceException("The price must be above $5000");
        }
        this.price = price;
    }

    private double fuelConsumption;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) throws InvalidCarParameterException {
        if (fuelConsumption < 1.0) {
            throw new InvalidFuelConsumptionException("The fuel consumption must be above 1.0 l/100km");
        }
        this.fuelConsumption = fuelConsumption;
    }

    public Vehicle() {
        this("Unknown", 1, 6000, 2.0);
    }

    public Vehicle(String name, int maxSpeed, double price, double fuelConsumption) {
        try {
            setName(name);
            setMaxSpeed(maxSpeed);
            setPrice(price);
            setFuelConsumption(fuelConsumption);
        } catch (InvalidCarParameterException ex) {
            System.err.println(ex.getMessage());
            canBeAdded = false;
        }
    }

    @Override
    public String toString() {
        return ("\nName: " + getName() + "\nPrice: " + getPrice()
                + ";\nFuel Consumption: " + getFuelConsumption()
                + "\nMaximal Speed: " + getMaxSpeed() + ".\n");
    }
}
