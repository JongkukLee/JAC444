package ca.jay.jac444.week10.sample.observer;

/************************************************************************
 *  Compilation:  javac Observable.java
 *
 *  The Observable contract of the Observer Design Pattern
 *
 ************************************************************************/
public interface Observable<T> {
    /**
     * add new observer to the collection of observers
     */
    public void registerObserver(Observer<T> o);

    /**
     * remove an observer from the collection of observers
     */
    public void unregisterObserver(Observer<T> o);

    /**
     * method to inform Observer about its new state
     */
    public void notifyObserver();
}
