package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import collections.generics.Dog;
import oops.Car;
import oops.Engine;
import oops.Vehicle;

public class CollectionsExplanation {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		for (int i = 0; i < 10; i++) {

		}
		for (String eachString : collection) {

		}
		collection.forEach(t -> System.out.println(t));
		System.out.println(collection.isEmpty());
		ArrayList<String> arraylist = new ArrayList<>();
		Collection<String> coll2 = new ArrayList<>();
		Vehicle vehicle = new Car();
//		arraylist.get(0);
//		coll2.get(0);
		coll2.clear();
		coll2.add("Test");
		arraylist.add("Test");
		arraylist.add("Test2");
		arraylist.add("Test3");
		arraylist.add("Test4");
		System.out.println(arraylist);
		arraylist.add(2, "Test5");
		System.out.println(arraylist);
		coll2.addAll(arraylist);
		System.out.println(coll2);
		arraylist.set(1, "TestSetMethod");
		System.out.println(arraylist);
		arraylist.remove(2);
		System.out.println(arraylist);
		arraylist.remove("Test4");
		System.out.println(arraylist);
		System.out.println(coll2.size());
		coll2.removeAll(arraylist);
		System.out.println(coll2);
		System.out.println(coll2.size());
		System.out.println(arraylist.size());
		arraylist.add("Test111");
		arraylist.add("Test111");
		arraylist.add("Test111");
		System.out.println(arraylist);
		System.out.println(arraylist.indexOf("TestSetMethod"));
		System.out.println(arraylist.indexOf("NonExistingString"));
		System.out.println(arraylist.indexOf("Test111"));
		System.out.println(arraylist.lastIndexOf("Test111"));

//		Integer[] integerArray = new Integer[5];
//		System.out.println(integerArray);
//		System.out.println(integerArray[0]);
//		System.out.println(integerArray[1]);
//		System.out.println(integerArray[2]);
//		System.out.println(integerArray[3]);
//		
//		int[] intArray = new int[5];
//		System.out.println(intArray);
//		System.out.println(intArray[0]);
//		System.out.println(intArray[1]);
//		System.out.println(intArray[2]);
//		System.out.println(intArray[3]);
//		String value = null;

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("String1");
		linkedList.add("String2");
		linkedList.add("String3");
		linkedList.add("String4");
		linkedList.add("String1");
		linkedList.add("Test111");
		linkedList.add("String1");
		System.out.println(linkedList.contains("String4"));
		System.out.println(linkedList.containsAll(arraylist));
//		Iterator<String> itr = linkedList.iterator();
//		int i = 0;
//		while (i < linkedList.size()) {
//			if (itr.hasNext()) {
//				System.out.println(itr.next());
//			}
//			i++;
//		}
		System.out.println(linkedList.peek());
		System.out.println(linkedList);
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(arraylist);
		linkedList.retainAll(arraylist);
		System.out.println(linkedList);
		System.out.println(arraylist);

		Vector<String> vector = new Vector<>();

		List<String> synchronizedArrayList = Collections.synchronizedList(arraylist);

		Stack<String> stack = new Stack<String>();
		stack.push("Plate1");
		stack.push("Plate2");
		stack.push("Plate3");
		stack.push("Plate4");
		stack.push("Plate5");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);

		String testHash = "Naresh";
		System.out.println(testHash.hashCode());
		testHash = "Sharmila";
		System.out.println(testHash.hashCode());

		Car car1 = new Car();
		Car car2 = new Car();
		car1.brand = "Maruti";
		car1.modelNo = "800";
		car1.setEngine(new Engine());
		car2.brand = "Maruti";
		car2.modelNo = "JAZ";
		car2.setEngine(new Engine());
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car1.equals(null));
		System.out.println(car1.equals(new Dog()));
		System.out.println(car1.equals(car1));
		System.out.println(car1.equals(car2));
		HashSet<String> set = new HashSet<>();
		System.out.println("Set addition");
		System.out.println(set.add("Naresh"));
		System.out.println(set.add("Sharmila"));
		System.out.println(set.add("Hemachandran"));
		System.out.println(set.add("Balaji"));
		System.out.println(set.add("Francina"));
		System.out.println(set.add("Hemachandran"));
		System.out.println(set.add("Balaji"));
		System.out.println(set);
		System.out.println("Naresh".hashCode());
		System.out.println("Sharmila".hashCode());
		System.out.println("Hemachandran".hashCode());
		System.out.println("Balaji".hashCode());
		System.out.println("Francina".hashCode());
		System.out.println("Naresh".hashCode() % 16);
		System.out.println("Sharmila".hashCode() % 16);
		System.out.println("Hemachandran".hashCode() % 16);
		System.out.println("Balaji".hashCode() % 16);
		System.out.println("Francina".hashCode() % 16);

		// n -> size of the collection
		// O(1) to O(log n) -> HashSet contains
		// O(n) -> ArrayList get, LinkedList contains
		
		
		HashSet<Car> carSet = new HashSet<>();
		carSet.add(car1);
		carSet.add(car2);
		System.out.println(carSet);
		
		
		HashSet<String> linkedHashSet = new LinkedHashSet<>();
		System.out.println("linkedHashSet addition");
		System.out.println(linkedHashSet.add("Naresh"));
		System.out.println(linkedHashSet.add("Sharmila"));
		System.out.println(linkedHashSet.add("Hemachandran"));
		System.out.println(linkedHashSet.add("Balaji"));
		linkedHashSet.add(null);
		System.out.println(linkedHashSet.add("Francina"));
		System.out.println(linkedHashSet.add("Hemachandran"));
		System.out.println(linkedHashSet.add("Balaji"));
		System.out.println(linkedHashSet);
		
		
		linkedHashSet.remove(null);
		TreeSet<String> treeSet = new TreeSet<>(linkedHashSet);
		System.out.println(treeSet);
		
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		TreeSet<String> treeSetComparator = new TreeSet<>(comparator);
		treeSetComparator.addAll(linkedHashSet);
		System.out.println(treeSetComparator);
		
		
//		Map<String,Integer> studentAgeMap = new TreeMap<>();
//		Map<String,Integer> studentAgeMap = new HashMap<>();
		Map<String,Integer> studentAgeMap = new LinkedHashMap<>();
		studentAgeMap.put("Naresh", 28);
		studentAgeMap.put("Sharmila", 25);
		studentAgeMap.put("Hemachandran", 25);
		studentAgeMap.put("Balaji", 27);
		studentAgeMap.put("Francina", 24);
		studentAgeMap.put("Hemachandran", 30);
		System.out.println(studentAgeMap);
		System.out.println(studentAgeMap.keySet());
		System.out.println(studentAgeMap.values());
		for(Entry<String,Integer> entry : studentAgeMap.entrySet()) {
			System.out.println(entry.getKey() +" --- "+entry.getValue());
		}
		

	}

}
