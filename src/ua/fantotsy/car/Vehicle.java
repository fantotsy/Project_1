/* project TaxiStation
 *
 * abstract class Vehicle
 *
 * fantotsy ©
 */

package ua.fantotsy.car;

abstract public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double fuelConsumption;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Vehicle() {
        this("Unknown", 1, 5000, 2.0);
    }

    public Vehicle(String name, int maxSpeed, double price, double fuelConsumption) {
        setName(name);
        setMaxSpeed(maxSpeed);
        setPrice(price);
        setFuelConsumption(fuelConsumption);
    }

    @Override
    public String toString() {
        return ("\nName: " + getName() + "\nPrice: " + getPrice()
                + ";\nFuel Consumption: " + getFuelConsumption()
                + "\nMaximal Speed: " + getMaxSpeed() + ";\n");
    }
}