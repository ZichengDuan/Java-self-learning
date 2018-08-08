package cn.bjsxt.oop.callback;

public class MyFrame {
	public void paint() {
		System.out.println("把自己的窗口画出来");
	}
}

interface IMyFrame{
	void paint();
}
