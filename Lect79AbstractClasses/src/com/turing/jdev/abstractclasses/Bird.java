package com.turing.jdev.abstractclasses;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is pecking");
	}

	@Override
	public void breathe() {
		System.out.println(getName() + " breating");
	}
	
	// ABSTRACT METHOD
	public abstract void fly();

	
}
