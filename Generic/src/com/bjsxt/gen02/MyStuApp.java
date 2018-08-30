package com.bjsxt.gen02;
/**
 * 泛型的擦除：使用时 || 实现 || 继承 没有指定的类型
 * 类似于Object,但是不等同于Object
 * @author duanzicheng
 *
 */
public class MyStuApp {
	public static void main(String[] args) {
		
		MyStudent student = new MyStudent();//没有指定泛型，此时泛型擦除
		test(student);//在没有指明泛型类型的时候，编译不会自动检查类型
		student.setMyStudent(100); 
		//100 --> int --> Integer --> Object 自动装箱
		Object a = student.getJavaeSE();
		System.out.println(a);
		
		
		
		MyStudent<Object> student2 = new MyStudent<Object>();//指定为Object
//		说明它不等同于Object
//		test(student2); 编译器报错，一旦指明类型，编译器就会自动检查类型是否相符
	}
	
	public static void test(MyStudent<Integer> stu) {
		
	}
}
