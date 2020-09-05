package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    }

    void example1(){

	}
}
