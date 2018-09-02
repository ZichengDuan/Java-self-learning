package com.bjsxt.io.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * mkdir() 创建目录， 必须确保父目录存在，如果不存在，创建失败，不报错
 * mkdirs() 创建目录，如果父目录不存在，全部一同创建
 * list() 文件|目录字符串形式
 * listFiles()
 * static listRoots() 根路径
 * @author duanzicheng
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		String path = "/Users/duanzicheng/Desktop/xd/";
		File src = new File(path); //文件夹
		if(src.isDirectory()) {	//存在并且为目录
			
			System.out.println("子目录|子文件名，");
			String[] subNames = src.list();
			for(String temp:subNames) {
				System.out.println(temp);
			}
			System.out.println();
			System.out.println("子目录|文件File对象");
			File[] subFiles = src.listFiles();
			for(File temp: subFiles) {
				System.out.println(temp.getAbsolutePath());
			}
			
			System.out.println();
			System.out.println("子目录|.java文件");
			subFiles = src.listFiles(new FilenameFilter() {		//原本是FilenameFilter filter，现在直接现场讲FilenameFilter实例化
																//之后再在这个匿名内部类里重写accept

				@Override
				public boolean accept(File dir, String name) {
					/**
					 * dir代表src
					 */
					return new File(dir, name).isFile() && name.endsWith(".java");
				}
				
			});
			for(File temp: subFiles) {
				System.out.println(temp.getAbsolutePath());
			}
		}
	}
	
	public static void test01() {
		String path = "/Users/duanzicheng/Desktop/xd/";
		File src = new File(path);
		src.mkdirs();
	}
	
}
