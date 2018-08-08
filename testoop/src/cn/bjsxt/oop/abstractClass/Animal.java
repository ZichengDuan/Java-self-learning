package cn.bjsxt.oop.abstractClass;

public abstract class Animal {
	public abstract void run();//抽象方法的意义在于，将方法的设计和方法的实现分离了
	
	public void breath() {
		System.out.println("呼吸");
		run();
	}
	
	public Animal() {
		System.out.println("创建一个动物");
	}
}
 
class Cat extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("猫步小跑");
	}
}
class Dog extends Animal{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("狗跑");
}
}
	

