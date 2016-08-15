package com.turing.jdev.abstractclasses;

public abstract class Animal {

	private String name;

	// CONSTRUCTOR
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void eat();
	
	public abstract void breathe();
	
	public String getName(){
		return name;
	}
	
}
