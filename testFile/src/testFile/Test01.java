package testFile;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		File f1 = new File("/Users/duanzicheng/Desktop/Desktop/UNNC/其他学术/GRE/阅读/阅读方法总论Yibo.docx");
		File f2 = new File("/Users/duanzicheng/Desktop/Desktop/UNNC/其他学术/GRE/阅读");
		
		if(f1.isFile()) {
			System.out.println("This is a File");
		}
		
		if(f2.isDirectory()) {
			System.out.println("This is a Dirctory");
		}
	}
}
