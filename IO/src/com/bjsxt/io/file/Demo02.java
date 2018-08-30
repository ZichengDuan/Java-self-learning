package com.bjsxt.io.file;

import java.io.File;

/**
 * 相对路径与绝对路径构造File对象
 * 1.相对路径
 * 		File(String parent, String child) ==> File("/Users/duanzicheng/Desktop/Desktop/UNNC/其他学术/Java/IO_Dic", "dzc.txt");
 * 		File(File parent, String child) ==> File(new File("/Users/duanzicheng/Desktop/Desktop/UNNC/其他学术/Java/IO_Dic", "dzc.txt");
 * 2.绝对路径
 * 		
 */
public class Demo02 {
	public static void main(String[] args) {
		String parentPath = "/Users/duanzicheng/Desktop/Desktop/UNNC/其他学术/Java/IO_Dic";
		String name = "dzc.txt";
		//相对路径
		File src = new File(parentPath, name);
		src = new File(new File(parentPath), name);
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getName());
		//绝对路径
		src = new File("/Users/duanzicheng/Desktop/Desktop/UNNC/其他学术/Java/IO_Dic/dzc.txt");
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getName());
		System.out.println(src.exists());
		//没有盘符:以user.dir构建
		src = new File("user.txt");
		System.out.println(src.getAbsolutePath());
		System.out.println(src.getName());
		System.out.println(src.exists());
	}
}
