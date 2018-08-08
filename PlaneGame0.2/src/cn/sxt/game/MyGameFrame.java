package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏主窗口
 * @author duanzicheng
 *
 */
public class MyGameFrame extends JFrame{
	
	Image jmt = GameUtil.getImage("images/IMG_2164.jpg");
	
	@Override
	
	public void paint(Graphics g) {		//自动被调用，G相当于一支画笔
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		g.drawLine(100, 100, 300, 300);
		g.setColor(Color.GRAY);
		g.setFont(new Font("楷体",Font.BOLD,50));
		g.drawString("楷体", 200,200);
		g.setColor(c);
		g.drawImage(jmt, 0, 0, null);
	}
	
	public void launchFrame() {
		this.setTitle("尚学堂学员_段子成作品");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 200);
		this.addWindowListener(new WindowAdapter() {
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
