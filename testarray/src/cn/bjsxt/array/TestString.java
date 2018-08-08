package cn.bjsxt.array;

public class TestString {
	public static void main(String[] args) {
		String str = new String("abcdasdasdasda");
		String str2 = new String ("abcd");
		System.out.println(str.charAt(2));
		System.out.println(str2.equals(str));//比较内容是否相等
		System.out.println(str2 == str);

		String str3 = "def";
		String str4 = "def";
		System.out.println(str4.equals(str3));
		System.out.println(str3 == str4);
		
		System.out.println(str.substring(3, 7));
		System.out.println(str.indexOf("s"));
		String bbb = str.replace("a", "*");
		System.out.println(bbb);
		String ccc[] = str.split("a");
		for(int i = 0; i < ccc.length; i++) {
			System.out.println(ccc[i]);
		}
		
		char[] ddd = str.toCharArray();
		System.out.println(ddd[0]);
	}
	
	
}
