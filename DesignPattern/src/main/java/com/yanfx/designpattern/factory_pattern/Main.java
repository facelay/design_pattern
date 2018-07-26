package com.yanfx.designpattern.factory_pattern;

public class Main {

	public static void main(String[] args) {
		Factory.getShape("CIRCLE").draw();
		Factory.getShape("RECTANGLE").draw();
		Factory.getShape("SQUARE").draw();
	}
}
