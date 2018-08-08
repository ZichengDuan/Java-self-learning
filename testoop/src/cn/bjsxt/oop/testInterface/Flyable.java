package cn.bjsxt.oop.testInterface;

public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HEIGHT = 1;
	void fly();
}

interface Attack{
	void attack();
}

class Plane implements Flyable{
	
	@Override
	public void  fly() {
		System.out.println("飞机依靠发动机飞行");
	}
}

class Man implements Flyable {
	
	@Override
	public void fly() {
		System.out.println("跳起来，飞！");
	}
}

class Stone implements Flyable,Attack{
	@Override
	public void fly() {
		System.out.println("被人仍起来飞！");
	}
	
	@Override
	public void attack() {
		
	}
}