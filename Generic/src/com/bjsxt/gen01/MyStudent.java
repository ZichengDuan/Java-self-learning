package com.bjsxt.gen01;

public class MyStudent<T> {
	private T javaSE;
//	private static T num;
//	不能用在static上
	
	
	public MyStudent(){
		
	}
	
	public void setMyStudent(T javaSE) {
		this.javaSE = javaSE;
	}
	
	public T getJavaeSE() {
		return javaSE;
	}
		
}
