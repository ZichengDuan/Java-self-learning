package com.bjsxt.gen04;

public class App {
	public static void main(String[] args) {
//		A<Fruit> f = new A<Apple>();
		A<Fruit> f = new A<Fruit>();
//		test(new Apple());//形参也不能使用多态
	}
	
	//形参使用多态
	public static void test(A<Fruit> f) {
		
	}
	
	//返回类型使用多态
	public static A<Fruit> test2(){
//		return new Apple();
		return null;
	}
}
