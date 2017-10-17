package ca.jay.jac444.week2.homework_solution;

/************************************************************************
 *  Compilation:  javac Automobile.java
 *  Execution:    java Automobile
 *
 *  Explains the use of inner class
 *
 *  Exercises 3  Lab 2
 *
 *  Output:
 *  For the car: VW
 *  Extra type wheel: Reserve
 *  Extra radius wheel: 1.1
 *
 * @author Jordan Anastasiade
 * @version 1.0, 10 Oct 2001
 * @version 1.1, 01 Aug 2017
 ************************************************************************/

public class Automobile {

    private String carName;
    private Wheel frontWheel;
    private Wheel rearWheel;
    private Wheel extra;

    /**
     * default constructor of outer class
     */
    public Automobile(String carName) {
        this.carName = carName;
        frontWheel = this.new Wheel();//new Wheel()
        rearWheel = this.new Wheel("GoodYear", 1.2f);
    }

    public Wheel thirdWheel(Automobile car) {

        if (car.extra == null) {
            car.extra = car.new Wheel("Reserve", 1.1f);
        }

        System.out.println("For the car: " + car.carName);
        System.out.println("Extra type wheel: " + car.extra.hubcapType);
        System.out.println("Extra radius wheel: " + car.extra.radius);

        return car.extra;
    }

    /**
     * Wheel inner class
     */
    private class Wheel {

        private String hubcapType;
        private float radius;

        /**
         * no-argument constructor of inner class
         */
        public Wheel() {
            hubcapType = "";
            radius = 0.0f;
        }

        public Wheel(String type, float r) {
            hubcapType = type;
            radius = r;
        }
    }

    public static void main(String[] args) {

        Automobile myCar = new Automobile("Honda");
        Automobile yourCar = new Automobile("VW");
        myCar.extra = myCar.thirdWheel(yourCar);
    }
}
