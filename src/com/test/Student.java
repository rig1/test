package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * example for converting a list to map using stream
 *
 */
public class Student implements Comparator<Student>{
	
	private Integer id;
	private String name;
	
	public Student(Integer id, String name) {
		this.id = id;
		this.name= name;
	}
	public Student(){
		
	}
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Barry"));
		list.add(new Student(2, "Allen"));
		list.add(new Student(3, "Oliver"));
		list.add(new Student(4, "Queen"));
		
		 Map<Integer, Student> map = list.stream().distinct().collect(Collectors.toMap(l -> l.getId(), l->l));
		 
		 map.forEach( (k, v)->{
			 System.out.println(" KEY : "+k +" Value : "+v);
		 });
		 
		 Collections.sort(list, new Student());
		 list.forEach(l->System.out.println(l.getName()));
		 
		 System.out.println(" using lamda");
		 Collections.sort(list, (s1, s2)->{
			 return s1.getId().compareTo(s2.getId());
		 });
		 list.forEach(l->System.out.println(l.getName()));
		 
		 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.getName());
	}
	
	
}
