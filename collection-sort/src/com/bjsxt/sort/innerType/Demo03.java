package com.bjsxt.sort.innerType;

import java.util.Date;

public class Demo03 {
	public static void main(String[] args) {
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(System.currentTimeMillis() - 1000 * 60 * 60);
		arr[2] = new Date(System.currentTimeMillis() + 1000 * 60 * 60);
		//降序
		int i = 0;
		Date middle;
		while(true) {
			if(i == arr.length) {
				break;
			}
			for(int j = 0; j < arr.length - 1-i;j++) {
				//从小到大 > 0
				//从大到小 < 0
			if(((Comparable)arr[j]).compareTo(arr[j+1]) > 0) {
					middle = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = middle;
				}
			}
			i++;
		}
		
		for(Date temp:arr) {
			System.out.println(temp);
		}
	}
}
