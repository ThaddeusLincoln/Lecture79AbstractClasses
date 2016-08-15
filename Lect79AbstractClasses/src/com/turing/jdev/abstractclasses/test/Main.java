package com.turing.jdev.abstractclasses.test;

import com.turing.jdev.abstractclasses.Dog;
import com.turing.jdev.abstractclasses.Parrot;
import com.turing.jdev.abstractclasses.Penguin;

public class Main {
	
	public static void main(String[] args){
	
		Dog dog = new Dog("Back");
		dog.eat();
		dog.breathe();
		
		Parrot parrot = new Parrot("Australian ringneck");
		parrot.eat();
		parrot.breathe();
		parrot.fly();
		
		Penguin skipper = new Penguin("Skipper");
		skipper.fly();
		
	}
}
