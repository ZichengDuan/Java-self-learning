package cn.bjsxt.oop.abstractClass;

public class Test {
	public static void main(String[] args) {
		Animal a = new Cat();
		
		a.run();
		
		Animal b = new Dog();
		
//		b.breath();
		b.run();
	}
}
