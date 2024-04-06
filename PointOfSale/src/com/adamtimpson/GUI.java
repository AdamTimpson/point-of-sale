package com.adamtimpson;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private final String TITLE; 
	private final int WIDTH, HEIGHT;
	
	public GUI() {
		super();
		
		this.TITLE = "";
		this.WIDTH = 0;
		this.HEIGHT = 0;
		
	}
	
	public GUI(String title, int width, int height) {
		super();
		
		this.TITLE = title;
		this.WIDTH = width;
		this.HEIGHT = height;
	}
	
	public void init() {
		this.setTitle(this.TITLE);
		this.setSize(new Dimension(this.WIDTH, this.HEIGHT));
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE); // Exit the Java app when the window closes
		this.setLocationRelativeTo(null); // Center the window on the display
		
//		this.pack();
	}
	
}
