/* project TaxiStation
 *
 * class Renault extends Vehicle
 *
 * fantotsy ©
 */

package ua.fantotsy.car;

/*
    Car Renault has air conditioning,
    no automatic transmission (it has manual transmission) and
    no music player.
 */
public class Renault extends Vehicle {
    private AirConditioning typeOfAC;

    public AirConditioning getTypeOfAC() {
        return typeOfAC;
    }

    public void setTypeOfAC(AirConditioning typeOfAC) {
        this.typeOfAC = typeOfAC;
    }

    public Renault() {
        super(Renault.class.getSimpleName(), 160, 25000, 8);
        typeOfAC = AirConditioning.AC;
    }

    public Renault(int maxSpeed, double price, double fuelConsumption, AirConditioning typeOfAC) {
        super(Renault.class.getSimpleName(), maxSpeed, price, fuelConsumption);
        this.typeOfAC = typeOfAC;
    }

    public enum AirConditioning {
        AC,
        ClimateControl
    }

    @Override
    public String toString() {
        return super.toString() + "Type of AC: " + typeOfAC + ".\n";
    }
}
