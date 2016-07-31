/* project TaxiStation
 *
 * class Bmw extends Vehicle
 *
 * fantotsy ©
 */

package ua.fantotsy.car;

/*
    Car Bmw has music player,
    no automatic transmission (it has manual transmission) and
    no air conditioning.
 */
public class Bmw extends Vehicle {
    private MusicPlayer typeOfMusicPlayer;

    public MusicPlayer getTypeOfMusicPlayer() {
        return typeOfMusicPlayer;
    }

    public void setTypeOfMusicPlayer(MusicPlayer typeOfMusicPlayer) {
        this.typeOfMusicPlayer = typeOfMusicPlayer;
    }

    public Bmw() {
        super(Bmw.class.getSimpleName(), 190, 40000, 10);
        typeOfMusicPlayer = MusicPlayer.CD;
    }

    public Bmw(int maxSpeed, double price, double fuelConsumption, MusicPlayer typeOfMusicPlayer) {
        super(Bmw.class.getSimpleName(), maxSpeed, price, fuelConsumption);
        this.typeOfMusicPlayer = typeOfMusicPlayer;
    }

    public enum MusicPlayer {
        CD,
        MP3
    }

    @Override
    public String toString() {
        return super.toString() + "Type of music player: " + typeOfMusicPlayer + ".\n";
    }
}
