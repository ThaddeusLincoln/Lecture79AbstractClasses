package com.turing.jdev.abstractclasses;

public class Main {
	
	public static void main(String[] args){
	
		Dog dog = new Dog("Back");
		dog.eat();
		dog.breathe();
		
		Bird bird = new Bird("Parrot");
		bird.eat();
		dog.breathe();
		
	}
}
