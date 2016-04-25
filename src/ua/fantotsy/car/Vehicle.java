package ua.fantotsy.car;

import ua.fantotsy.car.exception.InvalidFuelConsumptionException;
import ua.fantotsy.car.exception.InvalidMaxSpeedException;
import ua.fantotsy.car.exception.InvalidNameException;
import ua.fantotsy.car.exception.InvalidPriceException;

abstract public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (name == "") {
            throw new InvalidNameException("The name cannot be empty");
        }
        this.name = name;
    }

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws InvalidMaxSpeedException {
        if (maxSpeed <= 0) {
            throw new InvalidMaxSpeedException("The maximal speed must be above zero", maxSpeed);
        }
        this.maxSpeed = maxSpeed;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidPriceException {
        if (price < 5000) {
            throw new InvalidPriceException("The price must be above $5000", price);
        }
        this.price = price;
    }

    private double fuelConsumption;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) throws InvalidFuelConsumptionException {
        if (fuelConsumption < 1.0) {
            throw new InvalidFuelConsumptionException("The fuel consumption must be above 1.0 l/100km",
                    fuelConsumption);
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
        } catch (InvalidNameException ex) {
            System.err.println(ex.getMessage());
        } catch (InvalidMaxSpeedException ex) {
            System.err.println(ex.getMessage());
            System.err.println(ex.getSpeed());
        } catch (InvalidPriceException ex) {
            System.err.println(ex.getMessage());
            System.err.println(ex.getPrice());
        }catch(InvalidFuelConsumptionException ex){
            System.err.println(ex.getMessage());
            System.err.println(ex.getFuelConsumption());
        }
    }

    @Override
    public String toString() {
        return ("\nName: " + getName() + "\nPrice: " + getPrice()
                + ";\nFuel Consumption: " + getFuelConsumption()
                + "\nMaximal Speed: " + getMaxSpeed() + ".\n");
    }
}
