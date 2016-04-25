package ua.fantotsy.car.exception;

public class InvalidMaxSpeedException extends Exception {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public InvalidMaxSpeedException(String message, int maxSpeed) {
        super(message);
        speed = maxSpeed;
    }
}
