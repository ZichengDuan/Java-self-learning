 package cn.bjsxt.test;
 
 import java.util.Date;
 
/**
 * 测试时间类对象
 * @author duanzicheng
 *
 */
public class TestDate {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		
		Date d2 = new Date(1000);
//		System.out.println(d2.toGMTString());
		System.out.println(d2.getTime());
	}
}
