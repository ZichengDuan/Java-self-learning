package com.bjsxt.io.file;

import java.io.File;

public class Demo03 {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		File src = new File("2.txt");
		System.out.println(src.getAbsolutePath());//完整路径
		System.out.println(src.getPath());//如果是相对路径就相对路径，如果是绝对路径那就绝对路径
		System.out.println(src.getParent());//返回上一级目录
		System.out.println(src.getName());
		System.out.println(src.exists());
		
	}
}
