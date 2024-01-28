package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) {
		Half half = (int a) -> a / 2;
		IsEven isEven = (int a) -> a % 2 == 0;
		System.out.println(half.getHalf(100));
		System.out.println(new HalfAndTwiceClass().getHalf(100));
		System.out.println(isEven.isEven(100123));

		Function<Integer, Boolean> checkEven = (Integer a) -> a / 2 == 0;
		System.out.println(checkEven.apply(100));
		Function<Integer, Boolean> checkFactorOfTwoOrThree = (Integer a) -> {
			if (a % 2 == 0) {
				if (a % 3 == 0) {
					return true;
				}
				return false;
			}
			return false;
		};
		Function<Integer, Boolean> checkFactorOfTwoOrThreeWay2 = (Integer a) -> a % 2 == 0 && a % 3 == 0;
		System.out.println(checkFactorOfTwoOrThree.apply(100));
		System.out.println(checkFactorOfTwoOrThreeWay2.apply(100));
		Function<Integer, Integer> half2 = a -> a / 2;
		System.out.println(half2.apply(10000));
		Function<Double, Double> half3 = (Double a) -> a / 2;
		System.out.println(half3.apply(10000D));
		Predicate<Integer> checkFactorOfTwoOrThreePredicate = (Integer a) -> a % 2 == 0 && a % 3 == 0;
		System.out.println(checkFactorOfTwoOrThreePredicate.test(155));
		Predicate<Integer> checkFactorOfFivePredicate = (Integer a) -> a % 5 == 0;
		System.out.println(checkFactorOfFivePredicate.test(155));
		System.out.println(checkFactorOfFivePredicate.negate().test(155));

		Half half1 = new HalfAndTwiceClass();
		Half half22 = new HalfClass2();
		half1.dummyDefaultMethod();
		half22.dummyDefaultMethod();

		System.out.println("***************COLLECTIONS*************");
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("Test");
		arraylist.add("Test2");
		arraylist.add("Test2");
		arraylist.add("Test2");
		arraylist.add("Test3");
		arraylist.add("Test3");
		arraylist.add("Test4");
		System.out.println(arraylist);

		arraylist.forEach(each -> System.out.println(each));
		arraylist.forEach(System.out::println);
		arraylist.forEach(String::toLowerCase);
		ArrayList<String> lowerCaseArrayList = new ArrayList<>();
		arraylist.forEach(each -> {
			lowerCaseArrayList.add(each.toLowerCase());
		});
		System.out.println(arraylist);
		System.out.println(lowerCaseArrayList);

		for (String each : arraylist) {
			if (each.endsWith("2")) {
				System.out.println(each);
			}
		}

		System.out.println("____");
		arraylist.stream().filter(a -> a.endsWith("2")).forEach(System.out::println);
		System.out.println("***");
		arraylist.parallelStream().distinct().filter(a -> a.endsWith("2")).forEach(System.out::println);

		Stream<String> myStream = arraylist.stream().filter(a -> a.endsWith("2"));
		List<String> listEndingWithTwo = myStream.collect(Collectors.toList());
		System.out.println(listEndingWithTwo);

		Map<String, Integer> studentAgeMap = new LinkedHashMap<>();
		studentAgeMap.put("Naresh", 28);
		studentAgeMap.put("Sharmila", 25);
		studentAgeMap.put("Hemachandran", 25);
		studentAgeMap.put("Balaji", 27);
		studentAgeMap.put("Francina", 24);
		studentAgeMap.put("Hemachandran", 30);
		System.out.println("LinkedHashMap - " + studentAgeMap);

//		Map<Object, Object> newMap = studentAgeMap.entrySet().stream().filter(each -> each.getValue() > 25)
//				.collect(Collectors.toMap(k -> k, v -> v));
//		System.out.println(newMap);

		if (studentAgeMap != null) {
			System.out.println(studentAgeMap.size());
		}

		Optional<Map<String, Integer>> opt = Optional.of(studentAgeMap);
		if (opt.isPresent()) {
			System.out.println(opt.get().size());
		}
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.plusDays(10));
		System.out.println(date.minusDays(10));
		System.out.println(System.currentTimeMillis());
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time);
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(() -> {
			System.out.println("My thread has started "+Thread.currentThread().getName());
		});
		t1.start();
		

	}

}
