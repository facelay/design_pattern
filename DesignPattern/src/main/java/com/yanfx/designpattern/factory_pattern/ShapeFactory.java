package com.yanfx.designpattern.factory_pattern;

public class ShapeFactory {

	// 使用 getShape 方法获取形状类型的对象
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase(Factory.CIRCLE.getName())) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase(Factory.RECTANGLE.getName())) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase(Factory.SQUARE.getName())) {
			return new Square();
		}
		return null;
	}
}
