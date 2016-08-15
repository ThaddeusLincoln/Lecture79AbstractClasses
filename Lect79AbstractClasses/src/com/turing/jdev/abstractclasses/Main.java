package com.turing.jdev.abstractclasses;

public class Main {
	
	public static void main(String[] args){
	
		Dog dog = new Dog("Back");
		dog.eat();
		dog.breathe();
		
		Parrot parrot = new Parrot("Australian ringneck");
		parrot.eat();
		parrot.breathe();
		parrot.fly();
		
	}
}
