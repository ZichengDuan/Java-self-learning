package cn.bjsxt.oop.testInterface;

public interface MyInterface {
	//接口里只有常量和抽象方法（一般情况下不变的东西）
	/*永远是public static final，写不写都是*/String MAX_GRADE = "BOSS";
	/*永远是public static final，写不写都是*/ int MAX_SPEED = 120;
	
	/*一直都是public abstract*/void test01();
	/*一直都是public abstract*/int test02(int a, int b);
	
}