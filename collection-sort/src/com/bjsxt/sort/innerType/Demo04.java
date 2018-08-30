package com.bjsxt.sort.innerType;

import java.util.Date;

public class Demo04 {
	public static void main(String[] args) {
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(System.currentTimeMillis() - 1000 * 60 * 60);
		arr[2] = new Date(System.currentTimeMillis() + 1000 * 60 * 60);
		
		Utils.sort(arr);
		
		String[] arr2 = {"a","abcd", "abc", "def"};
		Utils.sort(arr2);
		
	}
}
