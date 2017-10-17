package ca.jay.jac444.week4.sample.clone;

/************************************************************************
 *  Compilation:  javac Address.java
 *  Execution:    java Address
 *
 *  Explains the cloning mechanisms in java
 *
 *  Output:
 *  Address = street: Heights, number: 9
 *  Cloned Address = street: Heights, number: 9
 *
 * @author Jordan Anastasiade
 * @version 1.0, 05 Aug 2017
 ************************************************************************/


public class Address implements Cloneable {

    public String street;
    public int number;

    public Address() {
        super();
    }

    public Address(String street, int number) {
        super();
        this.street = street;
        this.number = number;
    }

    public static void main(String[] args) {
        Address a = new Address("Heights", 9);
        Address cloneed = (Address) a.clone();
        System.out.println("Address = " + a);
        System.out.println("Cloned Address = " + cloneed);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + number;
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        return result;
    }

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

    @Override
    public String toString() {
        return "street: " + street + ", number: " + number;
    }

    /**
     * It clones the current object
     *
     * @return the cloned object of type Object
     */
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            return null;
        }
    }
}