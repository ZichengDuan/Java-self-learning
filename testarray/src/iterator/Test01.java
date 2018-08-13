package iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test01 {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("aaa");
	list.add("bbb");
	list.add("ccc");
	
	//通过迭代器遍历List
	
	for(Iterator iter = list.iterator(); iter.hasNext();) {
			
			String str = (String) iter.next();
			System.out.println(str);
		}
	
	Set set = new HashSet();
	set.add("1");
	set.add("2");
	set.add("3");
	set.add("4");
	set.add("高5");
	
	//通过迭代器遍历set 
	
	for(Iterator iter2 = set.iterator(); iter2.hasNext();) {
		
		String str2 = (String) iter2.next();
		System.out.println(str2);
	}
}
}