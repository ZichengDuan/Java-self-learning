 package cn.bjsxt.myCollection;

import java.util.Arrays;

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
		 if(size >= value.length - 1 ) {
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
	 
	 public void remove(int index) {
		 //删除指定位置对象
		 if(index >=  size) {
			 System.out.println("输入的检索值过大，请输入小于" + size + "的数字！");
			 System.exit(-1);
		 }
		 System.arraycopy(value, index + 1, value, index, size-index -1);
		 value[--size] = null;
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
		for(int i = 0; i < list.size;i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		list.remove(7);
		
		for(int i = 0; i < list.size;i++) {
			System.out.print(list.get(i) + "  ");
		}
	 }
}
