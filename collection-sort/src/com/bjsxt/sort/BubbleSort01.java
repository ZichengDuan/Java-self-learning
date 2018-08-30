package com.bjsxt.sort;

public class BubbleSort01 {
	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5};
		int i = 0;
		int middle;
		while(true) {
			if(i == arr.length) {
				break;
			}
			for(int j = 0; j < arr.length - 1-i;j++) {
			if(arr[j] > arr[j+1]) {
					middle = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = middle;
				}
			}
			i++; 
		}
		
		for(int temp:arr) {
			System.out.println(temp);
		}
	}
}
