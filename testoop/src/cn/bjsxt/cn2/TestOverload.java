package cn.bjsxt.cn2;
/**
 * test overload
 * @author duanzicheng
 *
 */
public class TestOverload {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		
		double result = m.add(4,5.28);
		int result2 = m.add(4,5,6);
		System.out.println(result);
		System.out.println(result2);
	}
}
 class MyMath{
	 
	 int a;
	 int b;
	 
	 public MyMath(){
		 
	 }
	 public MyMath(int a){
		 this.a = a;
	 }
	 public MyMath(int a, int b){
		 this.a = a;
		 this.b = b;
	 }
	 public int add(int a, int b) {
		 return a + b;
	 }
	 public int add(double a, int b) {
		 return (int) (a + b);
	 }
	 public double add(int b, double a) {
		 return (a + b);
	 }
	 
	 public int add(int a, int b, int c) {
		 return a + b + c;
	 }
	 
	 
 }