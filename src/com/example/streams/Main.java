package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	    List<Integer> list1 = new ArrayList<>();

	    list.forEach(e->list1.add(e*e));

	    //System.out.println(list1);

	    Stream<Integer> stream = Stream.empty();
	    Stream<Integer> stream1 = list.stream();

	    //System.out.println(stream1.findFirst().get());

	    list.stream().map(a->a*a).filter(a->a%2==0).forEach(System.out::println);

	    Main main = new Main();
	    main.example1();
	    main.example2();

    }

    void example1(){
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<100;i++)
			list.add(i);

		list.stream().map(a->a*a).filter(a->a<100).map(a->a*a*a).forEach(System.out::println);
	}

	void example2(){
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		List list = stream.map(a->a*a).collect(Collectors.toList());
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(list);

		ArrayList<Integer> array = stream1.filter(a->a%2==0).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(array);

		final int[] a = new int[]{0};
		Supplier<Integer> supplier = ()->a[0]++;

		Stream stream2 = Stream.generate(supplier).limit(100).parallel();
		stream2.forEach(System.out::println);
	}
}
