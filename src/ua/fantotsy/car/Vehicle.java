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

    private int fuelConsumption;

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Vehicle(String name, int maxSpeed, int price, int fuelConsumption){
        setName(name);
        setMaxSpeed(maxSpeed);
        setPrice(price);
        setFuelConsumption(fuelConsumption);
    }

    public String getInfo(){
        return ("\nName: " + getName() + "\nPrice: " + getPrice()
                + ";\nFuel Consumption: " + getFuelConsumption()
                + "\nMaximal Speed: " + getMaxSpeed() + ".\n");
    }
}
