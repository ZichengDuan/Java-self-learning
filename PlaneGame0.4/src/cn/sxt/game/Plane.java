package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;

public class Plane extends GameObject{
	
	public Plane(Image img, int x, int y) {
		this.img = img;
		this.x = x;
		this.y = y;
	}
	
	public void drawSelf(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
	}
}
