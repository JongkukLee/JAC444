package ca.jay.jac444.week10.sample.observer;

/************************************************************************
 *  Compilation:  ObserverPatternExample.java
 *  Execution:    java ObserverPatternExample
 *
 *  This class defines a Course and two types of learners
 *  It uses the Observer pattern to notify learners
 *  when the course content is modified, updated.
 *
 *  1. create the Observable (subject) object of type Course
 *  2. create two Observer objects: inclassLerner and onlineLerner
 *  3. register learners with the course
 *  4. notify learners
 *  5. add new content (second lesson)
 *  6. notify learners
 *  7. unregister an Observer (the inclass lerner)
 *  8. add new content (third lesson)
 *  9. notify learners
 *
 *  Output:
 *  In class learner reads: First Lesson
 *  Online learner reads: First Lesson
 *  In class learner reads: Second Lesson
 *  Online learner reads: Second Lesson
 *  Online learner reads: Third Lesson
 ************************************************************************/
public class ObserverPatternExample {

    public static void main(String[] args) {

        // 1. create the Observable (subject) object of type Course
        Course<String> subject = new Course<>("First Lesson");

        // 2. create two Observer objects: inclassLerner and onlineLerner
        Observer<String> inclassLerner = new InclassLearner<String>(subject);
        Observer<String> onlineLerner = new OnlineLearner<String>(subject);

        // 3. register learners with the course
        subject.registerObserver(inclassLerner);
        subject.registerObserver(onlineLerner);

        //4. notify learners
        subject.notifyObserver();

        //5. add new content (second lesson)
        subject.setContent("Second Lesson");

        //6. notify learners
        subject.notifyObserver();

        //7. unregister an Observer (the inclass lerner)
        subject.unregisterObserver(inclassLerner);

        //8. add new content (third lesson)
        subject.setContent("Third Lesson");

        //9. notify learners
        subject.notifyObserver();

    }
}
