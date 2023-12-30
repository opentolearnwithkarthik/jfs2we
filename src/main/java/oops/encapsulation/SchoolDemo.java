package oops.encapsulation;

import java.util.ArrayList;
import java.util.List;

import fundamentals.Student;

public class SchoolDemo {

	public static void main(String[] args) {
		School ssvmSchool = new School();
		ssvmSchool.name = "SSVM";
		List<Student> students = new ArrayList<>();
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		ssvmSchool.enrolStudents(students);
		// regulatory norms failure
		Government govt = new Government();
		govt.closeSchool(ssvmSchool);
	}

}
