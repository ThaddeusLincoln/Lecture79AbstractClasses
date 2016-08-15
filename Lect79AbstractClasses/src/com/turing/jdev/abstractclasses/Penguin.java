package com.turing.jdev.abstractclasses;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("We penguins are not very good at that");
	}
	
	

	
}
