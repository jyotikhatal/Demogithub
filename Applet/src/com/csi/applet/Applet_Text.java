package com.csi.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.TextField;

public class Applet_Text extends Applet{
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		TextField text1 = new TextField(20);
		add(text1);
		text1.setText("Hello from java..!");
		 Button button1 = new Button("Click here..!");
		 add(button1);		
		 TextArea textarea = new TextArea("Jyoti", 20, 25);
		 add(textarea);
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
