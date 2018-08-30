package com.bjsxt.sort.innerType;

public class Utils {
	/**
	 * 数组的排序，降序
	 * @param arr
	 */
	public static void sort(Object[] arr) {
		int i = 0;
		Object middle;
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
		
		for(Object temp:arr) {
			if(temp == arr[0]) {
				System.out.println();
				System.out.print(temp + ", ");
			}
			if(temp != arr[arr.length - 1] && temp != arr[0]) {
				System.out.print(temp + ", ");
			}
			if(temp == arr[arr.length - 1]) {
				System.out.print(temp);
			}
		}
	}
}
