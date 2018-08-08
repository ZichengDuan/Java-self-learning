package cn.bjsxt.cn2;
/**
 * 段子成
 * @author duanzicheng
 * @version 1.0
 *
 * 
 */



import java.util.Random;
public class Hello {
	/**
	 * 
	 * @param n: the biggest
	 * @return thie biggest
	 */
	public static int b;
	public static void main(String[] args) {
		for(int m = 1; m <= 9; m ++) {
			for (int i = 1; i <= m; i++) {
				System.out.print(i + "*" + m + "=" + i * m + "\t");
			}
			System.out.println();
		}
		Random rand = new Random();
		System.out.println(rand.nextInt(100));
		System.out.println(b);
		
	}
}
