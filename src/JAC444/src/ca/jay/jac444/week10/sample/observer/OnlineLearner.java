package ca.jay.jac444.week10.sample.observer;

/************************************************************************
 *  Compilation:  javac OnlineLearner.java
 *
 *  ConcreteObserver - OnlineLearner class implements Observer
 *
 ************************************************************************/
public class OnlineLearner<T> implements Observer<T> {

    /**
     * the observable object
     * it is needed to obtain directly data from Observable
     **/
    private Course<T> course;

    /**
     * Constructor - it builds an object of type Observer
     *
     * @param course a Observable object
     */
    public OnlineLearner(Course<T> course) {
        this.course = course;
    }


    /**
     * It is called by Observable to notify the Observer when its state was changed
     * The observer renders the new data (the new Observable state)
     */
    public void update() {
        System.out.println("Online learner reads: " + course.getContent() );
    }
}
