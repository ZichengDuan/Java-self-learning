package com.bjsxt.gen02;

/**
 * 
 * 泛型父类,子类为富二代（必须不能少于父类
 * 1.保留父类类型 --> 子类为泛型类
 * 2.不保留父类类型 --> 子类按需实现
 * 
 * 
 * 属性及方法的类型 --> 随声明位置而定：
 * 
 * 子类的重写方法类型 --> 随父类而定
 * 子类中使用父类的属性 --> 随父类而定
 * 
 * 子类新增的方法类型 --> 随子类而定
 * 子类使用自己的属性 --> 随子类而定
 */
public abstract class Father<T1, T2> {
	//在此父类中，T1类型用作声明父类中的变量
	//T2类型用于定义方法
	T1 age;
	public abstract void test(T2 name);
	
}

//T1、T2如何处理
//保留下来，由子类实现 --> 泛型子类

//分为全保留和
class C1<T1,T2, A, B> extends Father<T1, T2>{
	A sex;
	@Override
	public void test(T2 name) {
//		this.age --> T1类型
//		 this.sex --> 随子类而定，
	}
	
	public void test2(T2 a) {	//随子类本身定T1 T2 A B都行
	}
}
	
//部分保留
class C2<T2, A, B> extends Father<Integer, T2>{
	@Override
	public void test(T2 name) {
//		this.age--> Integer类型
	}
}


//不保留，替换成具体类型 --> 按需实现

//分为具体类型
class C3 extends Father<Integer, String>{
	
	public void test(String name) {
			
		}
}

//和没有类型，擦除的是OBJECT
class C4 extends Father<Object, Object>{

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
//		this.age --> Object类型
	}
}