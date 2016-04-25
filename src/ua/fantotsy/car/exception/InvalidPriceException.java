package ua.fantotsy.car.exception;

public class InvalidPriceException extends Exception {
    private double price;

    public double getPrice() {
        return price;
    }

    public InvalidPriceException(String message, double price){
        super(message);
        this.price = price;
    }
}
