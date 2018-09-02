package com.bjsxt.io.file;

import java.io.File;

/**
 * 输出子孙级目录|文件的名称（绝对路径）
 * 1. listFiles();
 * 2. d递归（自己调自己）
 * @author duanzicheng
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String path = "/Users/duanzicheng/Desktop/Desktop";
		File parent = new File(path);
		printName(parent);
	}
	/**
	 * 输出路径
	 */
	
	public static void printName(File src) {
		if(null == src || !src.exists()) {
			return;
		}
		System.out.println(src.getAbsolutePath());
		if(src.isDirectory()) {		//如果是个文件夹
			for(File sub:src.listFiles()) {
				printName(sub);
			} 
		}
	}
}
