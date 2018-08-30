package generic03;

import java.util.ArrayList;
import java.util.List;

/**
 * ?（半角问号） --> 通配符，类型不确定，用于声明变量|形参上
 * 不能用于创建泛型对象、泛型类、泛型接口，只能用于声明
 * 
 * @author duanzicheng
 *
 */
public class Wildcardstest {
	public static void main(String[] args) {
		//声明
		List<?> list;
		list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		list = new ArrayList<Object>();
		test(list);
		
		//编译错误
		//list = new ArrayList<?>();
	}
	
	public static void test(List<?> list) {
	}
//	public static <?> void test2(List<?> list) {}
//	不能用在泛型方法上
	class test<T>{
		
	}
//	报错，不能用于创建泛型类
//	 class test2<?>{
//	}
}
