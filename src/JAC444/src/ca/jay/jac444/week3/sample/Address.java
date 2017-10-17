package ca.jay.jac444.week3.sample;

/************************************************************************
 *  Compilation:  javac Address.java
 *  Execution:    java Address
 *
 *  Explains the overriden methods: hashCode, equals, toString
 *
 *
 *  Output:
 *
 * @author Jordan Anastasiade
 * @version 1.1, 01 Aug 2017
 ************************************************************************/

public class Address {

    // fields
    public String street;
    public int number;

    // defualt ctr
    public Address() {
        super();
    }

    // constructor
    public Address(String street, int number) {
        super();
        this.street = street;
        this.number = number;
    }


    /**
     * Overriden hashCode (inherited from Object class)
     *
     * @return the hashcode of the object
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + number;
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        return result;
    }

    /**
     * Overriden equal (inherited from Object class)
     *
     * @param obj - the reference object with which to compare
     * @return boolean value:
     * true if this object is the same as the obj argument;
     * false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (number != other.number)
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        return true;
    }

    /**
     * Overriden toString (inherited from Object class)
     *
     * @return a string representation of the object.
     *
     */
    @Override
    public java.lang.String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }

    public static void main(String[] args) {
        Address mine = new Address("RedMaple", 24);
        Address yours = new Address("RedMaple", 24);

        System.out.println(mine);
        System.out.println("hasecode = " + Integer.toHexString(mine.hashCode()));
        System.out.println(mine.equals(yours));
    }
}
