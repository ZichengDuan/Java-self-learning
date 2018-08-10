package cn.bjsxt.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口类
 * @author duanzicheng
 *
 */
public class GameFrame extends Frame{ //GUI编程：AWT，SWING实际上用不到，所以简化
	/**
	 * 加载窗口
	 */
	public void launchFrame() {
		setSize(300,300);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100, 100, 200, 200);
		Font f = new Font("宋体",Font. BOLD, 100);
		g.setFont(f);
		g.drawString("狗子！", 200, 200);
		g.fillRect(100, 100, 20, 20);
		Color c = g.getColor();
		g.setColor(new Color(213,123,231 ));
		g.fillOval(200, 200, 20, 20);
		g.setColor(c);
		g.fillRect(100, 100, 200, 20);
	}

	public static void main(String[] args) {
		GameFrame gf = new GameFrame();
		gf.launchFrame();
	}
}
