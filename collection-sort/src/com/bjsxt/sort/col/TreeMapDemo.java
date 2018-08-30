package com.bjsxt.sort.col;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Person p1 = new Person("您",100);
		Person p2 = new Person("刘德华",1000);
		Person p3 = new Person("梁朝伟",1200);
		Person p4 = new Person("老裴",50);
		
		TreeMap<Person, String> map = new TreeMap<Person, String>(new java.util.Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getHandsome() - o2.getHandsome();
			}
			
		});
		map.put(p1, "a");
		map.put(p2, "a");
		map.put(p3, "a");
		map.put(p4, "a");
		
		//查看键
		Set<Person> persons = map.keySet();
		System.out.println(persons);
	}
}
