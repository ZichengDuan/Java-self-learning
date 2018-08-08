
public class testString {
	public static void main(String[] args) {
		String str = new String("abcd");
		System.out.println(str.charAt(3));
		String str2 = new String("abcd");//创建了一个对象
		System.out.println(str2.equals(str));
		//.equals比较的是字符串内容
		System.out.println(str2 == str);
		//比地址
		String str3 = "abcd";//直接存在常量池
		String str4 = str3.replace('d', '2');
		System.out.println(str4);
		
	}
}
