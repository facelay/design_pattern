package com.yanfx.designpattern.singleton_pattern;

public class Singleton_2 {

	private static Singleton_2 instance = new Singleton_2();

	private Singleton_2() {
	}

	/**
	 * 饿汉式
	 * 
	 * 这种方式比较常用，但是容易产生垃圾对象。
	 * 
	 * 优点：没有加锁，执行效率会很高。
	 * 
	 * 缺点：类加载时就初始化了，浪费内存
	 * 
	 * @return
	 */
	public static Singleton_2 getInstance() {
		return instance;
	}
}
