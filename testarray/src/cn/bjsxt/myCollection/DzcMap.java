package cn.bjsxt.myCollection;
/**
 * 自定义实现Map的功能！(暂不完美)
 * @author duanzicheng
 *
 */
public class DzcMap {
	LinkedList[] arr = new LinkedList[999];
	//Map的底层结构本身就是：数组+链表；
	int size;
	
	public void put(Object key, Object value) {		//自定义put方法
		MyEntry e = new MyEntry(key, value);
		int hash = key.hashCode();
		hash = hash < 0 ? -hash : hash;
		int a = hash % arr.length;
		if(arr[a] == null) {
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		}
		else {
			LinkedList list = arr[a];
			for(int i = 0; i < list.size(); i++) {
				MyEntry e2 = (MyEntry) list.get(i);
				if(e2.key.equals(key)) {
					e2.value = value;
				}
		}
		}
		arr[size++] = e;
	}
	
	public Object get(Object key) {					//自定义get方法
		for(int i = 0; i < size; i++) {
			if(arr[i].key.equals(key)) {
				return arr[i].value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key) {		//自定义containsKEY方法
		for(int i = 0; i < size; i++) {
			if(e2.key.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {		//主函数
		DzcMap dm = new DzcMap();
		dm.put(123, 456);
		dm.put(123, "value");
		System.out.println(dm.get(123));
		System.out.println(dm.containsKey(123));
	}
	
	
}

