package com.yanfx.designpattern.factory_pattern;

public class Main {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		sf.getShape(Factory.CIRCLE.getName()).draw();
		sf.getShape(Factory.RECTANGLE.getName()).draw();
		sf.getShape(Factory.SQUARE.getName()).draw();
	}
}
