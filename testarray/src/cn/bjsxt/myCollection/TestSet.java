package cn.bjsxt.myCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试set常用方法
 * @author duanzicheng
 *
 */
public class TestSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.contains("aaa"));
		System.out.println(set.remove("bbb"));
		System.out.println(set);
	}
}
