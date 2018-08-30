package com.bjsxt.gen02;

import java.util.ArrayList;
import java.util.List;

/**
 * super:泛型的上限 >= 即父类或者自身
 * 
 * 
 * 
 * @author duanzicheng
 *
 */
public class SuperTest {
	public static void main(String[] args) {
		List<Apple>list1 = new ArrayList<Apple>();
		test(list1);
		List<Fruit> list2 = new ArrayList<Fruit>();
		test(list2);
		List<Object> list3 = new ArrayList<Object>();
		test(list3);
		
		//规则
		List <? super Apple> list4 = new ArrayList<Apple>();
		test(list4);
		List<? super Fruit> list5 = new ArrayList<Object>();
		test(list5);
	}
	
	public static void test(List<? super Apple> list) {
		
	}
}
