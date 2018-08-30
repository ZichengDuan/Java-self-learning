package generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * <?> == <? extends Object>gf
 * 
 * 
 * @author duanzicheng
 *
 */
public class A<T> {
	public void doSomething(A<? extends List> a) {
		List<String> l1 = new ArrayList<String>();
		l1.add("成员");
		List<?> l2 = l1;
		List<?> l3 = new LinkedList<Integer>();
		System.out.println(l2.get(0));
	}
}
