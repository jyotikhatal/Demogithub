package com.csi.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Apple extends Applet {
	public void init()//initialize the applet here
	{
		setBackground(Color.GRAY);
	}
	public void start()//each time applet appears again on the screen
	{
		
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello from java..!", 60, 100);
		g.drawLine(20, 3, 5, 50);
	}
	public void stop()
	{
		
	}

}
