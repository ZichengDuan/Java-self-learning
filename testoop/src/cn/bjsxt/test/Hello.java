package cn.bjsxt.test;

import java.util.Random;
public class Hello {
	public static void main(String[] args) {
		for(int m = 1; m <= 9; m ++) {
			for (int i = 1; i <= m; i++) {
				System.out.print(i + "*" + m + "=" + i * m + "\t");
			}
			System.out.println();
		}
		Random rand = new Random();
		System.out.println(rand.nextInt(100));
	}
}
