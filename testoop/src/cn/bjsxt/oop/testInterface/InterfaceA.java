package cn.bjsxt.oop.testInterface;

public interface InterfaceA {
	void aaa();
}

interface InterfaceB {
	void bbb();
}

interface InterfaceC extends InterfaceA, InterfaceB{
	void cccc();
}

class TestClass implements InterfaceC{

	@Override
	public void cccc() {
	}

	@Override
	public void aaa() {
	}

	@Override
	public void bbb() {
	}
	
}
