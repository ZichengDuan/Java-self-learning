package cn.bjsxt.myCollection02;

public class MyIterator {
	private String[] elem = {"a", "b", "c", "d", "e", "f", "g"};
	private int size = elem.length;
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
		
	}
	
	public static void main(String[] args) {
		MyIterator list = new MyIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}
	
	
	
	
	
	
	
	
}
