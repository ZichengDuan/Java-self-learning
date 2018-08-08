package cn.bjsxt.oop.testObject;

/**
 * 测试多态
 * @author duanzicheng
 *
 */
public class TestPolymorphism {
	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		
		Dog b = new Dog();
		animalCry(b);
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}
}

class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    } 
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}