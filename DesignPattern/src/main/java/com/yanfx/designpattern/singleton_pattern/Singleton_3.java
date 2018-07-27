package com.yanfx.designpattern.singleton_pattern;

public class Singleton_3 {

	/**
	 * 双检锁/双重校验锁（DCL，即 double-checked locking）
	 * 
	 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。 getInstance() 的性能对应用程序很关键。
	 */
	private static Singleton_3 instance;

	private Singleton_3() {
	}

	public static Singleton_3 getInstance() {
		if (instance == null) {
			synchronized (Singleton_3.class) {
				if (instance == null) {
					instance = new Singleton_3();
				}
			}
		}
		return instance;
	}

}
