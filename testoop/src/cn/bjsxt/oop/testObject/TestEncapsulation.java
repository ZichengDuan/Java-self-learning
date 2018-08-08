package cn.bjsxt.oop.testObject;

/**
 * 测试封装
 * @author duanzicheng
 *
 */

import java.util.Scanner;
public class TestEncapsulation {
	public static void main(String[] args) {
		int temp_sel = 0;
		int temp_age = 0;
		Human h = new Human();
		Scanner s1 = new Scanner(System.in);
		while(true) {
			while(true) {
				System.out.println("请选择功能：\n 1 为设置年龄， 2 为显示当前年龄 3 为直接退出");
				try {
					temp_sel = Integer.parseInt(s1.next());
					if(temp_sel == 1 || temp_sel == 2 || temp_sel == 3) {
						break;
					}else {
						System.out.println("请在1 2 3之间做出选择！");
						continue;
						
					}
				}catch(NumberFormatException e) {
					System.out.println("请输入正确的整数数字");
					continue;
				}
				
			}
			
			
			if(temp_sel == 1) {
				System.out.println("请输入年龄！");
				while(true) {
					try {
						temp_age = Integer.parseInt(s1.next());
						if(temp_age > 110 || temp_age < 0) {
							System.out.println("年龄不得大于110岁或者是小于0岁");
							continue;
						}else {
							System.out.println("设置成功！");
							System.out.println();
							break;
						}
					}catch(NumberFormatException e) {
						System.out.println("请输入正确的整数数字!\n");
						System.out.println();
						continue;
					}
				}
				h.setAge(temp_age);
			}
			
			if(temp_sel == 2){
				System.out.println("当前设置的年龄为： " + h.sayAge() + "岁。");
				System.out.println();
			}
			if(temp_sel == 3) {
				System.out.println("程序退出！");
				System.exit(0);
			}
		}
	}
}


class Human{
	
	private int age;
	
	public int sayAge() {
		return this.age;
	}
	
	public void setAge(int age) {
			this.age = age;
		}
	}
	