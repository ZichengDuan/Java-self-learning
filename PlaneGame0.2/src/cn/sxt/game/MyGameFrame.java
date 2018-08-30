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
	
	Image ball = GameUtil.getImage("images/ball.png");
	
	@Override
	public void paint(Graphics g) {	//自动调用。 g相当于一支画笔
		g.drawLine(100,100,300,300);
		g.drawImage(ball, 300, 300, null);
		
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
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
 