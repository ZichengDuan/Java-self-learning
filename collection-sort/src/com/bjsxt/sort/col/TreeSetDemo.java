package com.bjsxt.sort.col;
/**
 * 提供了解耦的方式：业务排序类
 */
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Person p = new Person("您",100);
		Person p2 = new Person("刘德华",1000);
		Person p3 = new Person("梁朝伟",1200);
		Person p4 = new Person("老裴",50);
		
		//依次存放到TreeSet容器中，使用排序的业务类(匿名内部类)
		//必须实现Comparable接口
		TreeSet<Person> person = new TreeSet<Person>(
				new java.util.Comparator<Person>() {
					
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getHandsome() - o2.getHandsome();
					}
				}
			);
		person.add(p);
		person.add(p2);
		//TreeSet在添加数据的过程中排序
		person.add(p3);
		person.add(p4);
		System.out.println(person);
		//改变数据可以证明,就算中途改变数据，
		//也不会再变了，因为一开始添加的时候已经排好了

	}
}
