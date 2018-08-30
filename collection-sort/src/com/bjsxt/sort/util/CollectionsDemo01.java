package com.bjsxt.sort.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * 找出重点方法
 * binarySearch(List<? extends Comparable <? super T>> list, T key)
 * sort(List<T> list)
 * sort(List<T> list, Comparator< ? super T> c)
 * reverse(List<?> list)
 * shuffle(List<?> list) 洗牌
 * @author duanzicheng
 *
 */
public class CollectionsDemo01 {
	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<Integer>();
		//洗牌模拟斗地主
		for(int i = 0; i < 54; i ++) {
			cards.add(i);
		}
		//洗牌
		Collections.shuffle(cards);
		//依次拿牌
		List<Integer> p1 = new ArrayList<Integer>();
		List<Integer> p2 = new ArrayList<Integer>();
		List<Integer> p3 = new ArrayList<Integer>();
		List<Integer> last = new ArrayList<Integer>();
		
		for(int i = 0; i < 49; i += 3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i + 1));
			p3.add(cards.get(i + 2));
		}
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));
		
		System.out.println("第一个人：" + p1);
		System.out.println("第二个人：" + p2);
		System.out.println("第三个人：" + p3);
		System.out.println("底牌为：" + last);
		
	}
	
	public static void testReverse() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
