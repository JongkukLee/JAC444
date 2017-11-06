package ca.jay.jac444.week10.sample.observer;

/************************************************************************
 *  Compilation:  javac InclassLearner.java
 *
 *  ConcreteObserver - InclassLearner class implements Observer
 *
 ************************************************************************/
public class InclassLearner<T> implements Observer<T> {

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
    public InclassLearner(Course<T> course) {
        this.course = course;
    }


    /**
     * It is called by Observable to notify the Observer when its state was changed
     * The observer renders the new data (the new Observable state)
     */
    public void update() {
        System.out.println("In class learner reads: " + course.getContent() );
    }
}
