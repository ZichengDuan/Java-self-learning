package com.bjsxt.gen02;
/**
 * 父类为泛型类
 * 1、属性
 * 2、方法
 *
 *要么同时擦除， 要么大于等于父类的类型
 * 
 */
public abstract class Father02<T,T1> {
	T name;
	public abstract void test(T1 t);
}


/**
 *声明时指定具体类型
 *属性的类型为具体类型
 *方法同理
 */
class Child01 extends Father02<String, Integer>{
	String t2;

	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}
}
/**
 * 
 *子类为泛型类，类型在使用的时候确定
 *
 */
class Child02<T,T1, T3> extends Father02<T, T1>{
	T1 t2;
	@Override
	public void test(T1 t) {
		
	}
}


/**
 * 子类为泛型类，父类不指定类型,泛型的擦除，使用Object替换
 */

class Child03<T1, T, T3> extends Father02{
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}

}

/**
 * 子类跟父类同时擦除
 */
class Child04 extends Father02{
	String name;
	@Override
	public void test(Object t) {
		
	}
}


/**
 * 错误：子类擦除，父类使用泛型
 *///class Child05 extends Father<T, T1>{
//	 String name;
//	 @Override
//	 public void test(T t) {
//		 
//	 }
// }







