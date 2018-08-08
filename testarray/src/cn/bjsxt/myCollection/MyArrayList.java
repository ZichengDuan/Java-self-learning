 package cn.bjsxt.myCollection;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
  * 模拟实现JDK提供的ArrayList
  * @author duanzicheng
  *
  */
public class MyArrayList {
	 Object[] value;
	 int size;
	 
	 public MyArrayList() {
		 this(16);
	 }
	 
	 public MyArrayList(int size) {
		 this.value = new Object[size];
	 }
	 
	 public void add(Object obj) {
		 value[size] = obj;
		 size++;
		 if(size >= value.length -1 ) {
			 //装不下，扩容
			 int newCapacity = value.length * 2;
			 Object[] newList = new Object[newCapacity];
			 for(int i = 0; i < value.length; i ++) {
				 newList[i] = value[i];
			 }
			 value = newList;
		 }
	 }
	 
	 public Object get(int index) {
		 if(index<0 || index > size -1) {		//0到size-1之间
			 try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
		 return value[index];
	 }
	 
	 public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("aaa");
		list.add(new Human("dzc"));
		list.add(new Human("dzcc"));
		list.add("bbbbb");
		list.add("bbbbb");
		list.add("bbbbb");
		list.add("bbbbb");
//		System.out.println(list.get(0));
//		System.out.println(((Human) list.get(1)).getName());
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
//		System.out.println(list.get(6));
		System.out.println(list.toString());
		
	 }
}
