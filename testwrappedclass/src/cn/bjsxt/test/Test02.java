package cn.bjsxt.test;
/**
 * 测试自动装箱和拆箱
 * @author duanzicheng
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000;			//jdk 5.0之后,可以自动装箱,自动装箱，编译器帮我们改进代码 
		
		int c = new Integer(1000);	//编译器改进： int c = new Integer(1500).intValue();
		
		Integer b = null;
//		int d = b;					//报错，因为实际上应该是int d = b.intValue(); 而 b == null;
//		System.out.println(d);
		
		
		Integer f = 1000;
		Integer e = 1000;
		System.out.println(e == f);	//false, 对象不同
		System.out.println(e.equals(f));	//true, 值相同
		
		
		Integer f1 = 100;
		Integer e1 = 100;
		System.out.println(e1 == f1);		//true
		System.out.println(e1.equals(f1));	//true
		//可以得到，[-128,127]之间的数，仍然当作基本数据类型来处理，为了提高效率，不存在装箱和拆箱
	}
}
