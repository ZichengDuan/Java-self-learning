package cn.bjsxt.myCollection;
/**
 * 自定义map的升级版，提升查询效率
 * @author duanzicheng
 *
 */
public class DzcMap02 {
	MyEntry[] arr = new MyEntry[999];
	int size;
	
	public void put(Object key, Object value) {
	int a = key.hashCode() % 999; 
	//除留余数法
		
		
	}
}
