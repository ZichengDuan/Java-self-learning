package cn.bjsxt.myCollection;

public class LinkedList {
	private Node first;
	private Node last;
	private int size;
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("dzc");
		list.add("jmt");
		list.add("oh");
		System.out.println(list.size);
		System.out.println(list.get(20));
	}
	
	
	public void add(Object obj) {
		Node n = new Node();
		
		if(first == null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}else {
			//直接往last节点后加新的节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			last.setNext(n);
			
			last = n;
		}
		size++;
	}
	
	public int size() {
		return size();
	}
	
	
	public Object get(int index) {
		Node curN = null;
		Node temp = null;
		if(index <= size && index >= 0) {
			if(first == null) {
				System.out.println("当前链表为空，请录入数据！");
			}else {
				curN = first;
				for(int i = 0; i < index; i++) {
					temp = curN;
					curN = temp.getNext();
				}
			}
		}else {
			System.out.println("输入值不符合要求，当前链表的长度是" + size);
			System.exit(-1);
		}
		return curN.getObj();
	}
	
	public void changeByIndex(int index) {
		
	}
	
	public void removeByIndex(int index) {
		
	}
	
	public void insertAfter(int index) {
		
	}
}

