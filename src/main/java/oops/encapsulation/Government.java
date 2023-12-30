package oops.encapsulation;

public class Government {

	private School kv;

	public void Goverment() {
		kv = new School();
		kv.name = "Kendriya Vidhyalaya";
	}

	public void closeSchool(School schoolToBeClosed) {
		kv.enrolStudents(schoolToBeClosed.students);
		schoolToBeClosed.closeSchool();
	}

}
