package com.patterns.facade;

public class ShapeMaker {
	
	private Rectangle rect;
	private Circle circle;
	private Triangle tri;
	
	public ShapeMaker(){
		this.rect = new Rectangle();
		this.circle = new Circle();
		this.tri = new Triangle();
	}
	
	public void drawCirle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rect.draw();
	}
}
