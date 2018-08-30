package com.bjsxt.gen02;

import java.util.ArrayList;
import java.util.List;

/**
 * extends：泛型的上限 <= 即子类
 * 1、一般用于限制某个操作
 * 2、不实用在添加数据上面，一般是对数据进行读取操作
 * 3、规则：
 * 		List<Fruit>可以放到List<? extends Fruit>里
 * 		List<Apple>可以放到 List<? extends Fruit>里
 * 		List<? extends Apple>可以放到 List<? extends Fruit>里
 * 
 * 	不能存放的
 * 	List<?>
 * 	List<? extends Object>
 * 
 * @author duanzicheng
 *Fruit继承链
 *				Object
 *				  |
 *				Fruit
 *				/	\
 *			Pear	Apple
 *					  |
 *				  FujiApple
 *
 *
 */
public class ExtendsTest {
	public static void main(String[] args) {
		//extends为上限
		Test<Fruit> t1 = new Test<Fruit>();
		Test<Apple> t2 = new  Test<Apple>();
		Test<Pear> t3 = new Test<Pear>();
		
		//调用test
		List<? extends Fruit> list1 = new ArrayList<Fruit>();
		test(list1);
		List<Pear> list2 = new ArrayList<Pear>();
		test(list2);
		List<Apple> list3 = new ArrayList<Apple>();
		test(list3);
		
		List<? extends Apple> list4 = new ArrayList<FujiApple>();
		test(list4);
		//下面的为什么错了？因为 ? 等同于 ? extends Object,而Object不是小于等于
		List<?> list5 = new ArrayList<Object>();
		List<? extends Object> list6 = new ArrayList<Object>();
//		test(list5);

		
	}
	// ? extends Fruit
	static void test(List<? extends Fruit> list) {
		/*
		list.add(new Apple());
		list.add(new FujiApple());
		*/
		//发现都不能加
		
	}
	
	
	static class Test< T extends Fruit>{
		
	}
}
