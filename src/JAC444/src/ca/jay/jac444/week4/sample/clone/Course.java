package ca.jay.jac444.week4.sample.clone;

/************************************************************************
 *  Compilation:  javac Course.java
 *  Execution:    java Course
 *
 *  Explains deep cloning
 *  clones a class whose instance variables contain
 *  a mutable object instance
 *
 *  Output:
 *  Course{name='JAC', code=444, courseBook=Book title=Java  [Gosling, Sun]}
 *  Course{name='JAC', code=444, courseBook=Book title=Java  [Gosling, Sun]}
 *  
 * @author Jordan Anastasiade
 * @version 1.0, 08 Aug 2017
 ************************************************************************/
public class Course implements Cloneable {
    String name;
    Integer code;
    Book courseBook;

    public Course(String name, Integer code, Book courseBook) {
        this.name = name;
        this.code = code;
        this.courseBook = courseBook;
    }

    public static void main(String[] args) {
        String[] as = {"Gosling", "Sun"};
        Course c = new Course("JAC", 444, new Book("Java ", as, 123));
        System.out.println(c);

        try {
            Course copyCourse = (Course) c.clone();
            System.out.println(copyCourse);

        } catch (CloneNotSupportedException e) {
            System.out.println("catch " + e.getMessage() + " not cloned !!!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        if (code != null ? !code.equals(course.code) : course.code != null) return false;
        if (courseBook != null ? !courseBook.equals(course.courseBook) : course.courseBook != null) return false;
        if (name != null ? !name.equals(course.name) : course.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (courseBook != null ? courseBook.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", courseBook=" + courseBook +
                '}';
    }

    /**
     * Example of deep cloning
     * it clones the Book object
     *
     * @return the cloned object of type Object
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course c = (Course) super.clone();
        c.courseBook = (Book) courseBook.clone();
        return c;
    }
}
