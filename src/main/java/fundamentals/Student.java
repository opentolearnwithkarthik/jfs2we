package fundamentals;

public class Student implements Comparable<Student> {

	int regNo;
	String firstName;
	String lastName;
	int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	private void study() {
		// TODO Auto-generated method stub

	}

	private void writeExam() {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Student o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age == o.age) {
			return 0;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	// a1.compareTo(a2) -> -1 0 1
	// a<b a==b a>b

}
