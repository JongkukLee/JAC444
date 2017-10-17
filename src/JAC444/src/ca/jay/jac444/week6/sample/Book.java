package ca.jay.jac444.week6.sample;

/************************************************************************
 *  Compilation:  javac Book.java
 *  Execution:    java Book
 *
 *  Explains how an object could be serialized by implementing
 *  java.io.Serializable
 *
 *  Output:
 *  nothing
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 Aug 2017
 ************************************************************************/
public class Book implements java.io.Serializable {

  private String name;
  private float price;

    public Book(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
