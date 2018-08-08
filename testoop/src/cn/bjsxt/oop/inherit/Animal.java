package cn.bjsxt.oop.inherit;
/**
 * 测试继承
 * @author duanzicheng
 *
 */
public class Animal {
	String eye;
	
	public Animal() {
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
}

class Mammal extends Animal {
	public void taisheng() {
		System.out.println("我是胎生！");
	}
}



class Bird extends Animal {
	
	public Bird() {
		super();
		System.out.println("建一个鸟对象！");
	}
	
	public void taisheng() {
		System.out.println("我是卵生！");
	}
	
	public void run() {
		System.out.println("I am a bird, I fly");
	}
}



