package cn.bjsxt.cn2;
import java.util.Scanner;
public class Point {
	double x;
	double y;
	double z;
	public Point(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static void main(String[] args) {
		double distance;
		double count = 0;
		double[] list1 = new double[3];
		double[] list2 = new double[3];
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("------------接下来是第一个点的坐标输入！-------------");
		for(int i = 0; i < 3; i++) {
			while(true) {
				System.out.print("请输入"+ ((char)(88 + i)) +"号值：");
				try {
					count = Double.parseDouble(s1.next());
					break;
				}catch(NumberFormatException e){
					System.out.println("请输入数字！当前格式不符");
					continue;
				}
			}
			list1[i] = count;
		}
		
		System.out.println("------------接下来是第二个点的坐标输入！-------------");
		for(int i = 0; i < 3; i++) {
			while(true) {
				System.out.print("请输入"+ (char)(88 + i) +"号值：");
				try {
					count = Double.parseDouble(s1.next());
					break;
				}catch(NumberFormatException e){
					System.out.println("请输入数字！当前格式不符");
					continue;
				}
			}
			list2[i] = count;
		}
		s1.close();
		Point p1 = new Point(list1[0],list1[0],list1[0]);
		Point p2 = new Point(list2[0], list2[1], list2[2]);
		
		distance = Math.pow(p1.x - p2.x,2) 
				+ Math.pow(p1.y - p2.y, 2)
				+ Math.pow(p1.z - p2.z, 2);
		distance = Math.sqrt(distance);
		System.out.println("p1点坐标是：(" + p1.x + "," + p1.y + "," + p1.z + ")");
		System.out.println("p2点坐标是：(" + p2.x + "," + p2.y + "," + p2.z + ")");
		System.out.println("两点间空间距离为： " + distance);
		
	}
}
