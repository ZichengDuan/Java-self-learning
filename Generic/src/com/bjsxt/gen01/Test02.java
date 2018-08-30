package com.bjsxt.gen01;
/**
 * 自定义泛型类的使用，在声明时制定具体的类型，不能是基本类型，只能是引用类型
 * @author duanzicheng
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//MyStudent<int> stu = new MyStudent<int>();//不能指定基本数据类型
		MyStudent<Integer> stu = new MyStudent<Integer>();
		stu.setMyStudent(1234);
		Integer score = stu.getJavaeSE();
		System.out.println(score);
	}
}
