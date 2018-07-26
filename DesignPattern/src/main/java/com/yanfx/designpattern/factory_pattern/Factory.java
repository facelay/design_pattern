package com.yanfx.designpattern.factory_pattern;

import lombok.Getter;

@Getter
public enum Factory {

	CIRCLE("Circle"), RECTANGLE("Rectangle"), SQUARE("Square");

	// 成员变量
	private String name;

	private Factory(String name) {
		this.name = name;
	}

}
