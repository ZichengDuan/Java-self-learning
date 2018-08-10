package cn.bjsxt.myCollection;

public class LinkedList {
	private Node first;
	private Node last;
	private int size;
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//在此处创建链表
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
		return this.size;
	}
	
	public Object get(int index) {
		Node curN = node(index);
		return curN.getObj();
	}
	
	public void changeByIndex(int index, Object whatEver) {
		Node curN = node(index);
		curN.setObj(whatEver);
	}
	
	public void removeByIndex(int index) {
		Node curN = node(index);
		Node up = curN.getPrevious();
		Node down = curN.getNext();
		up.setNext(down);
		down.setPrevious(up);
		size--;
		
	}

	public void insertAfter(int index, Object whatEver) {
		Node curN = node(index);
		Node newN = new Node();
		Node up = curN;
		Node down = curN.getNext();
		newN.setObj(whatEver);
		newN.setNext(down);
		newN.setPrevious(up);
		curN.setNext(newN);
		size++;
	}
	
	public Node node(int index) {
		Node curN = null;
		if(index <= size && index >= 0) {
			if(first == null) {
				System.out.println("当前链表为空，请录入数据！");
			}else {
				curN = first;
				for(int i = 0; i < index; i++) {
					curN = curN.getNext();
				}
			}
		}else {
			System.out.println("输入值不符合要求，当前链表的长度是" + size);
			System.exit(-1);
		}
		return curN;
	}
}

