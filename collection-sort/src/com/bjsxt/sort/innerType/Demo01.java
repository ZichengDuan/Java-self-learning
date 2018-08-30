package com.bjsxt.sort.innerType;
/**
 * 内置数据类型（常用）的比较
 * @author duanzicheng
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Integer a;//根据基本数据类型大小
		Character ch; //根据unicode编码顺序排序
		String str = "abcd";// 
		String str2 = "abcd123";//否则返回第一个起不相等的的unicode码之差
		System.out.println(str.compareTo(str2));
		
		str = "abc";
		str2 = "afd";
		
		System.out.println(str.compareTo(str2));
		
		java.util.Date d;	//根据日期的长整型数
		
	}
}
