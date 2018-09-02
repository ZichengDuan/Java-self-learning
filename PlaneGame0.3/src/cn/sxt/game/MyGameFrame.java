package cn.sxt.game;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏主窗口
 */

public class MyGameFrame extends JFrame {
	
	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	int planeX = 250;
	int planeY = 250;
	
	@Override
	public void paint(Graphics g) {	//自动调用。 g相 当于一支画笔
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		planeX++;
	}
	
	
	
	//帮助我们反复重画窗口
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				System.out.println("窗口画一次！");
				repaint();	//重画
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 初始化窗口
	 */
	public void launchFrame() {
		setTitle("段子成作品");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		/*
		 * 窗口关闭意味着程序关闭
		 */
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//启动线程
		new PaintThread().start();//启动重画窗口的线程
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
 