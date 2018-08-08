package cn.bjxst.oop.InnerClass;

public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Face.Nose n = f.new Nose();
		n.breath();
	}
}

class Face{
	int type = 100;
	
	class Nose{
		String type = "dzc";
		
		void breath() {
			System.out.println(type);
			System.out.println("呼吸");
		}
	}
}