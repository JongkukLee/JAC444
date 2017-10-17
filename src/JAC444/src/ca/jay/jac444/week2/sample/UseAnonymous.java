package ca.jay.jac444.week2.sample;

/************************************************************************
 *  Compilation:  UseAnonymous.java
 *  Execution:    java UseAnonymous
 *
 *  Example of using anonymous class - lecture 2
 *
 *  Output:
 *  From an anonymous class
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 200-03-24
 ************************************************************************/

interface Sayable {
	void say();
}

public class UseAnonymous {

    public static void main(String[] args) {

        //anonymous class
        Sayable s = new Sayable() {

            @Override
            public void say() {
                System.out.println("From an anonymous class");
            }
        };

        //invoke of method on an object of type Sayable
        s.say();
    };
};
