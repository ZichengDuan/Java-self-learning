package cn.bjsxt.myCollection02;

import java.util.Iterator;

/**
 * 简化迭代器原理，加入接口，提供方法（重要∆）
 * @author duanzicheng
 *
 */

public class MyIterator02 {
	private String[] elem = {"a", "b", "c", "d", "e", "f", "g"};
	private int size = elem.length;
	private class MyIt implements Iterator<String>{
		private int cursor = -1;
		/**
		 * 判断是否存在下一个元素
		 */
		public boolean hasNext() {
			return  cursor + 1 < size;
		}
		
		/**
		 * 获取下一个元素
		 */
		public String next() {
			cursor++;
			return elem[cursor];
		}
		
		public void remove() {
			//不实现了
		}
		
		
	}
	
	public Iterator<String> iterator(){
		return new MyIt();
	}
	
	public static void main(String[] args) {
		MyIterator02 list = new MyIterator02();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
	
	
	
	
	
	
	
}
