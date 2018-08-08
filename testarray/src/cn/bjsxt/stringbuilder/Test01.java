package cn.bjsxt.stringbuilder;
/**
 * 测试可变字符序列：StringBuilder（线程不安全，效率高）, StringBuffer（线程安全，效率低）
 * @author duanzicheng
 *
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //字符数组长度为16
		StringBuilder sb1 = new StringBuilder(32); //字符数组长度为32
		StringBuilder sb2 = new StringBuilder("abcd"); //字符数组长度为32
		
		System.out.println(sb2);
	}
}
