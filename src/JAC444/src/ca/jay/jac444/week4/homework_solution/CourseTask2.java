package ca.jay.jac444.week4.homework_solution;

public class CourseTask2 implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public CourseTask2(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	@Override /** Override the proceted clone method defined in 
		the Object class, and strengthen its accessibility */
	public CourseTask2 clone() throws CloneNotSupportedException {
		// Perform a shallow copy
		CourseTask2 courseClone =	(CourseTask2)super.clone();
		// Deep copy on students
		courseClone.students = students.clone();
		return courseClone;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9
	}
}