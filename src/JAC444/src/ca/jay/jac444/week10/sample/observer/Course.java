package ca.jay.jac444.week10.sample.observer;

import java.util.ArrayList;
import java.util.List;
/************************************************************************
 *  Compilation:  javac Course.java
 *
 *  ConcreteObservable - Course class implements Observable
 *
 ************************************************************************/
public class Course<T> implements Observable<T> {

    /**
     * the collection of observers objects
     **/
    private List<Observer<T>> observers;
    /**
     * the observable data
     **/
    private T content;

    /**
     * Constructor - it builds an object of type ConcreteObservable
     * with the initial data
     * @param content an object of type T
     */
    public Course(T content) {
        this.observers = new ArrayList<Observer<T>>();
        this.content = content;
    }

    /**
     * Add an object of type Observer to the collection of observers
     * @param o the object of type Observer
     */
    @Override
    public void registerObserver(Observer<T> o) {
       observers.add(o);
    }

    /**
     * Remove an object of type Observer from the collection of observers
     * @param o the object of type Observer
     */
    @Override
    public void unregisterObserver(Observer<T> o) {
        observers.remove(o);
    }


    /**
     * Notify all objects of type Observer when the the state of Observable change
     * - the state of Course is changed
     */
    @Override
    public void notifyObserver() {
        for(Observer<T> observer : observers)
            observer.update();
    }

    /**
     * Get the data of the Observable
     * @return the data of the Observable - an object of type T
     */
    public T getContent() {
        return content;
    }


    /**
     * Set the data of the Observable
     * @param content an object of type T- the Observable data
     */
    public void setContent(T content) {
        this.content = content;
    }
}
