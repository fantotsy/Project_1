/* project TaxiStation
 *
 * class Audi extends Vehicle
 *
 * fantotsy ©
 */

package ua.fantotsy.car;

/*
    Car Audi has automatic transmission,
    no music player and
    no air conditioning.
 */
public class Audi extends Vehicle {
    private AutomaticTransmission typeOfAT;

    public AutomaticTransmission getTypeOfAT() {
        return typeOfAT;
    }

    public void setTypeOfAT(AutomaticTransmission typeOfAT) {
        this.typeOfAT = typeOfAT;
    }

    public Audi() {
        super(Audi.class.getSimpleName(), 180, 30000, 9);
        typeOfAT = AutomaticTransmission.Hydraulic;
    }

    public Audi(int maxSpeed, double price, double fuelConsumption, AutomaticTransmission typeOfAT) {
        super(Audi.class.getSimpleName(), maxSpeed, price, fuelConsumption);
        this.typeOfAT = typeOfAT;
    }

    public enum AutomaticTransmission {
        Hydraulic,
        Robot,
        Variator
    }

    @Override
    public String toString() {
        return super.toString() + "Type of AT: " + typeOfAT + ".\n";
    }
}
