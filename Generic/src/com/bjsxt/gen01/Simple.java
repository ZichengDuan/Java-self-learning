package com.bjsxt.gen01;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的入门< >
 * 1. 标签，泛化类型
 * 2. 作用：省心、安全
 * @author duanzicheng
 *
 */
public class Simple {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		安全
//		list.add(1);//会类型检查
		list.add("Str");
//		省心
		list.get(0);//已经是既定的数据类型了
		 		
	}
}
