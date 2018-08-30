package cn.bjsxt.myCollection02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * this is a map and that is a mice and where is the food
 * 统计每个单词出现的次数
 * 存储到Map中
 * key: String
 * value: 自定义
 * 
 * “分拣”思路
 * 1、 为所有的key创建容器
 * 	   之后容器中存放对应的value
 * 2、 第一次创建容器并存放值
 * 	   之后直接使用现有容器存放值
 * 
 */
public class Demo01 {
	public static void main(String[] args) {
		String str = "this is a map and that is a mice and where is the food";
		String[] strArray = str.split(" ");
		Map<String, Letter> letter = new HashMap<String, Letter>();
		for(String temp:strArray) {
			if(!letter.containsKey(temp)) {
				letter.put(temp, new Letter());
				Letter col = letter.get(temp);
				for(int i = 0; i < strArray.length;i++) {
					if(strArray[i].equals(temp)) {
						col.setCount(col.getCount() + 1);
					}
				}
			}
		}
		
		Set<String> keys = letter.keySet();
		for(String key:keys) {
			Letter col = letter.get(key);
			System.out.println("单词:" + key + ", 次数:" + col.getCount());

		}
		
	}
	
	
	public static void test01() {
		String str = "this is a map and that is a mice and where is the food";
		//分割字符串
		String[] strArray = str.split(" ");
		Map<String, Letter> letters = new HashMap<String, Letter>();
		for(String temp:strArray) {
			//1、 为所有的key创建容器
			if(!letters.containsKey(temp)) {
				letters.put(temp, new Letter());
			}
			//	 之后容器中存放对应的value
			Letter col = letters.get(temp);
			col.setCount(col.getCount() + 1);
		}
		
		//输出Map的值
		Set<String> keys = letters.keySet();
		for(String key:keys) {
			Letter col = letters.get(key);
			System.out.println("单词:" + key + ", 次数:" + col.getCount());
		}
		
	}
}
