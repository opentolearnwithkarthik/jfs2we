package oops.encapsulation;

import java.util.List;

import fundamentals.Student;

public class School {

	// buildings
	// teachers
	// students
	// classrooms

	String name;

	List<Student> students;

	public void enrolStudents(List<Student> students) {
		this.students = students;
	}

	public void closeSchool() {
		this.students = null;
		this.name = null;
	}

	// takeAdmission
	// takeClass
	// closeSchool

}
