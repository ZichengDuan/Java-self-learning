package com.bjsxt.gen01;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * 非泛型类中 定义泛型
 * @author duanzicheng
 *
 */
public class Method {
	//泛型方法定义：在返回类型前面<字母>
	public static <T> void test(T t) {
		System.out.println(t);
	}
	public static <T extends List> void test(T t) {
		System.out.println(t);
		t.add("aaa");
		System.out.println(t);
	}
	//用于释放资源，传进来的东西都被close了
	//此处三个点是可变参数，意思是传进来的参数都被存在了数组里，可以通过遍历进行提取
	public static <T extends Closeable> void test(T... a) {
		for(T temp:a) {
			try {
				if(null != temp) {
					temp.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		test("bjsxt is very good");
		test(new FileInputStream("a.txt"));
	} 
}
