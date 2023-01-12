package com.pattern.singleton;

/**
 * This class's objects will be created in singleton way
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class SingletonClass {

	private static SingletonClass singletonInstance;

	/**
	 * Constructor must be private so objects can't be created from outside
	 */
	private SingletonClass() {

	}

	/**
	 * Non thread safe singleton object. Because if this method is called by
	 * multiple threads at the same time,
	 * 
	 * @return
	 */
	public static SingletonClass getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonClass();
		}
		return singletonInstance;
	}

	/**
	 * Non thread safe singleton object. Because if this method is called by
	 * multiple threads at the same time,
	 * 
	 * @return
	 */
	public static SingletonClass getInstanceThreadSafe() {
		if (singletonInstance == null) {
			synchronized (SingletonClass.class) {
				if (singletonInstance == null) {
					singletonInstance = new SingletonClass();
				}
			}
		}
		return singletonInstance;
	}
}
