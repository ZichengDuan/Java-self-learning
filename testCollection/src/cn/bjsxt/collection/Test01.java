package cn.bjsxt.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List list = new ArrayList<Comparable>();
		//ArrayList:底层实现是数组，线程不安全，所以查询快。修改、插入、删除慢
		//LinkedList:底层实现是链表，线程不安全，查询慢，修改插入删除快
		//Vector:线程安全，效率低。
		
		
		
		list.add("aaa");
		list.add(new Date());
//		list.remove("aaa");
		System.out.println(list.size() );
		
		List list2 = new ArrayList();
		list2.add(123);//自动装箱
		list2.add("aaa");
		System.out.println(list2);
		list.add(list2);
		System.out.println(list);
		
		
		//跟顺序有关的操作
		System.out.println(list.get(0)); 
		Object w = list.get(0);//返回Object类型
		System.out.println(w);
		w = w + "aaa";
		System.out.println(w);
		list.set(2, "dzc");
		System.out.println(list);
	}
}
