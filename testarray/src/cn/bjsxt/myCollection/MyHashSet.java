package cn.bjsxt.myCollection;

import java.util.HashMap;

/**
 * 定义自己的HashSet
 * @author duanzicheng
 *
 */
public class MyHashSet {
	
	HashMap map;
	int size;
	private static final Object PRESENT = new Object();
	
	public int size() {
		return map.size();
	}
	
	public MyHashSet() {
		map = new HashMap();
		size++;
	}
	
	public void add(Object o) {
		map.put(o, PRESENT);	//set的不可重复就是利用了map里面键对象不可重复
	}
	
	
	
	public static void main(String[] args) {
		MyHashSet s = new MyHashSet();
		s.add("aaa");
		s.add(new String ("bbb"));
		
		System.out.println(s);
	}
} 
