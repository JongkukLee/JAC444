package ca.jay.jac444.week2.sample;

/************************************************************************
 *  Compilation:  Bicycle.java
 *  Execution:    java Bicycle
 *
 *  Example of defining a class in java - lecture 2
 *
 *  Output:
 *  Bycle cadence: 2 speed: 6 gear: 1
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2002-02-24
 ************************************************************************/
public class Bicycle {

    // fields
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    // default ctr - ctr without params
    Bicycle() {
    }

    // ctr with one param
    Bicycle(int cadence) {
        this.cadence = cadence;
    }

    // ctr with two params
    Bicycle(int cadence, int speed) {
        this(cadence); // use the ctr with one param
        this.speed = speed;
    }

    // ctr with three params
    Bicycle(int c, int s, int g) {
        this(c, s); // use the ctr with two params
        gear = g;
    }

    /**
     * Private method to change cadence
     *
     * @param newValue change cadence value
     */
    private void changeCadence(int newValue) {
        cadence = newValue;
    }

    /**
     * Change speed
     *
     * @param increment increment speed value
     * @param cadence   change cadence value
     */
    public void speedUp(int increment, int cadence) {
        speed = speed + increment;
        changeCadence(cadence);
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    /**
     * Display the status of bicycle
     */
    void printState() {
        System.out.println("Bycle cadence: " + cadence + " speed: "
                + speed + " gear: " + gear);
    }

    public static void main(String[] args) {
        //construct an object
        Bicycle mine = new Bicycle(2, 5, 1);

        //invoke methods on it
        mine.changeCadence(2);
        mine.speedUp(1, 2);
        mine.printState();
    }
}