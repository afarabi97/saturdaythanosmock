package com.upskill.java_6;

public class Singleton {
	
	// Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating
	private Singleton(){
		
	}
	
	//Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	//Static instance method
	public static Singleton getInstance(){
		return SingletonObj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singletone class");
	}
	
	protected static void Emad(){
		System.out.println("Emad method for singletone class");
	}
	
	protected static void Akash(){
		System.out.println("Akash method for singletone class");
	}
	
	protected static void Saima(){
		System.out.println("Saima method for singletone class");
	}
}
