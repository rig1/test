package com.test;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  map() convert an object to something else
 *  
 *
 */
public class StreamsTest {
	
	public static void main(String[] args) {
		
		Collection<String> collection = Arrays.asList("a","b","c","a","C");
		
		System.out.println( collection.stream().allMatch(c->c.equalsIgnoreCase("a")) );
		
		System.out.println( collection.stream().anyMatch(c -> c.equalsIgnoreCase("a")) );
		
		String[] arryForC = collection.stream().filter(c->c.equalsIgnoreCase("C") ).toArray( String[] :: new);
		System.out.println(" length : "+arryForC.length);
		Map<String, String> map = collection.stream().distinct().collect(Collectors.toMap(c->c, c->c));
		map.forEach( (k, v)->System.out.println(k+" "+v));
		
		
		collection.forEach(System.out::println);
		Stream stream = collection.stream();
		
		List<String> list = collection.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> list2 = collection.stream().map(c->c.toUpperCase()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list2);
		
		Stream sm = stream.filter(s-> s.equals("a"));
		System.out.println(sm.count());
		
		TestFunctional tf = (a,b)->{
			return a+b;
		};
		System.out.println(tf.add(10, 11));
		
	}
	
	
	
}
