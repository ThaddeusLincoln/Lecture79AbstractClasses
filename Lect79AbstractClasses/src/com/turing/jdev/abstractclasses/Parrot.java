package com.turing.jdev.abstractclasses;

public class Parrot extends Bird{

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("Flitting from branch to branch");
	}
}
