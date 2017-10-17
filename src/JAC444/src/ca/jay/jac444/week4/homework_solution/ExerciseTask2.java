package ca.jay.jac444.week4.homework_solution;

public class ExerciseTask2 {
	public static void main(String[] args) 
			throws CloneNotSupportedException {
		// Create a course object
		CourseTask2 course1 = new CourseTask2("Data Structures");

		// Add three students to course1
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne kennedy");

		// Clone course1
		CourseTask2 course2 = course1.clone();

		// Add three students to course2
		course2.addStudent("Jamal Jones");
		course2.addStudent("Steve Smith");

		// Display students in course1
		System.out.println("\nNumber of students in course1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();

		// Display students in course2
		System.out.println("\nNumber of students in course2: "
			+ course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2[i] + ", ");
		System.out.println();
	}
}