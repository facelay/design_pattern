package com.yanfx.designpattern.singleton_pattern;

public class Singleton_1 {

	private static Singleton_1 instance;

	private Singleton_1() {
	}

	/**
	 * 懒汉式，线程不安全 ；
	 * 
	 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。 这种方式
	 * lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
	 * 
	 * @return
	 */
	public static Singleton_1 getInstance() {
		if (instance == null) {
			instance = new Singleton_1();
		}
		return instance;
	}

	/**
	 * 懒汉式，线程安全
	 * 
	 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
	 */
	public static synchronized Singleton_1 getInstance2() {
		if (instance == null) {
			instance = new Singleton_1();
		}
		return instance;
	}

}
