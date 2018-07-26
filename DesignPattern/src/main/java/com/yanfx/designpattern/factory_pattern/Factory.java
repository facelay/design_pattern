package com.yanfx.designpattern.factory_pattern;

import lombok.Getter;

@Getter
public enum Factory {

	CIRCLE(new Circle(), "CIRCLE"), 
	RECTANGLE(new Rectangle(), "RECTANGLE"), 
	SQUARE(new Square(), "SQUARE");

	// 成员变量
	private Shape shape;
	private String name;

	private Factory(Shape shape, String name) {
		this.shape = shape;
		this.name = name;
	}

	// 普通方法
	public static Shape getShape(String name) {
		for (Factory c : Factory.values()) {
			if (c.name == name) {
				return c.shape;
			}
		}
		return null;
	}

}
