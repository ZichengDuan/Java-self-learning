package cn.bjsxt.oop.inherit;

/**
 * 
 * 测试组合
 * @author duanzicheng
 *
 */
public class Animal2 {
	String eye;
	
	public Animal2() {
		super();
		System.out.println("创建一个动物！");
	}
	
	public void run() {
		System.out.println("run!");
	}
	public void eat() {
		System.out.println("eat!");
	}
	public void sleep() {
		System.out.println("zzzz!");
	}
	
	public static void main(String[] args) {
		Bird2 b = new Bird2();
		b.run();
		b.animal2.eat();
	}
}

//
class Mammal2 {
	Animal2 animal2 = new Animal2();
	
	public void taisheng() {
		System.out.println("我是胎生！");
	}
}

 
// 
class Bird2 {
	Animal2 animal2 = new Animal2();
	
	public Bird2() {
		System.out.println("建一个鸟对象！");
	}
	
	public void taisheng() {
		System.out.println("我是卵生！");
	}
	
	public void run() {
		animal2.run();
		System.out.println("I am a bird, I fly");
		System.out.println(animal2 instanceof Animal2);
	}
	
	
}









