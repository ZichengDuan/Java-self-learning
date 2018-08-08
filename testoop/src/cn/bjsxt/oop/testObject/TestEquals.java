package cn.bjsxt.oop.testObject;

public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		
		User u1 = new User(1000, "dzc", "123456");
		User u2 = new User(1000, "ddzc", "123456");
		
//		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	} 
}

class User{
	int id;
	String name;
	String pwd;
	
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		User u = (User)obj;
		if(this.id == u.id) {
			return true;
		}
		else {
			return false;
		}
	}
	
}








