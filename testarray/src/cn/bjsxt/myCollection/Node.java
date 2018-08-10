package cn.bjsxt.myCollection;

//用来表示一个节点
public class Node{
	private Node previous; //上一个节点，而不是上一个对象
	private Object obj;
	private Node next;		//下一个节点，而不是上一个对象
	
	public Node() {
	}
	
	public Node(Node previous, Object obj, Node next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	public Object getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}