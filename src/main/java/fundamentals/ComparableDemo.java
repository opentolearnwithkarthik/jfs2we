package fundamentals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import file.operations.TextFileOperations;

public class ComparableDemo {

	static String name = "set";
	static Student s5 = new Student();

	public static void main(String[] args) throws IOException {
		method1();
		TextFileOperations.main(null);
		System.gc();
		Runtime.getRuntime().gc();
	}

	private static void method1() {

		Student s1 = new Student();
		s1.firstName = "Karthik";
		s1.age = 31;
		s1.regNo = 1;

		Student s2 = new Student();
		s2.firstName = "Surya";
		s2.age = 23;
		s2.regNo = 2;

		Student s3 = new Student();
		s3.firstName = "Vishal";
		s3.age = 40;
		s3.regNo = 3;

		System.out.println(s1.compareTo(s2)); // -1 if arg1 < arg2
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));

		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
//		TreeSet<Student> treeset = new TreeSet<Student>(list);
//		System.out.println(treeset);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, getNameBasedComparator());
		System.out.println(list);
		Collections.sort(list, getDescendingNameBasedComparator());
		System.out.println(list);
//		Comparator<Student> comparator = (a, b) -> a.lastName.compareTo(b.lastName);
		Collections.sort(list, (a, b) -> a.lastName.compareTo(b.lastName));
		System.out.println(list);
		
		
		 ArrayList<Integer> al = new ArrayList<Integer>();
	        al.add(205);
	        al.add(102);
	        al.add(98);
	        al.add(275);
	        al.add(203);
	        System.out.println("Elements of the ArrayList " + 
	                              "before sorting : " + al);
	 
	        // using lambda expression in place of comparator object
	        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 :
	                                       (o1 < o2) ? 1 : 0);
	 
	        System.out.println("Elements of the ArrayList after" + 
	                                           " sorting : " + al);

	}

	private static Comparator<Student> getNameBasedComparator() {
		return new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.firstName.compareTo(o2.firstName);
			}
		};
	}

	private static Comparator<Student> getDescendingNameBasedComparator() {
		return new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.firstName.compareTo(o1.firstName);
			}
		};
	}

}
