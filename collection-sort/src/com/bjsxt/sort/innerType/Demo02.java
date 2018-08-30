package com.bjsxt.sort.innerType;

public class Demo02 {
	public static void main(String[] args) {
		String[] arr = {"a","abcd", "abc", "def"};
		//从小到大排序
		int i = 0;
		String middle;
		while(true) {
			if(i == arr.length) {
				break;
			}
			for(int j = 0; j < arr.length - 1-i;j++) {
				//从小到大 > 0
				//从大到小 < 0
			if(((Comparable)arr[j]).compareTo(arr[j+1]) < 0) {
					middle = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = middle;
				}
			}
			i++;
		}
		
		for(String temp:arr) {
			System.out.println(temp);
		}
	}
}
