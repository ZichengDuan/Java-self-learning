package cn.bjsxt.myCollection;

import java.util.HashMap;
import java.util.Map;
/**
 * 测试Map的基本用法
 * HashMap线程不安全，效率高
 * HashMap线程安全，效率低
 * @author duanzicheng
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("高淇", new Wife("张曼玉"));
		map.put("张三",new Wife("李四"));
		map.put(123, 456);
		map.put("UNNC", "CalTech");
		map.put(123,456);
		System.out.println(map);
		System.out.println(map.containsKey("UNNC"));
		
		Map map2 = new HashMap();
		map2.put(111, 222);
		map2.put(111, 222);
		map2.put(111, 222);
		map2.put(111, "001");
		map2.put(333, 444);
		map2.put(555, 666);
		System.out.println(map2);
		
	}
}

class Wife{
	String name;
	
	public Wife(String name) {
		this.name = name;
	}
}