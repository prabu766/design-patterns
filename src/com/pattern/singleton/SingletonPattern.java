package com.pattern.singleton;

/**
 * 
 * @author prabhuddha.bhashitha
 * Singleton is a creational design pattern where it allowed ONLY one object to be created per JVM
 * 
 */
public class SingletonPattern {
	
	public static void main(String[] args) {
		SingletonClass singleIns = SingletonClass.getInstance();
	}
}
