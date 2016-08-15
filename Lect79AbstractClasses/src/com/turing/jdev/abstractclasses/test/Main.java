package com.turing.jdev.abstractclasses.test;

import com.turing.jdev.abstractclasses.Dog;
import com.turing.jdev.abstractclasses.Parrot;
import com.turing.jdev.abstractclasses.Penguin;
import com.turing.jdev.abstractclasses.searchtree.Node;
import com.turing.jdev.abstractclasses.searchtree.SearchTree;

public class Main {
	
	public static void main(String[] args){
	
		/*Dog dog = new Dog("Back");
		dog.eat();
		dog.breathe();
		
		Parrot parrot = new Parrot("Australian ringneck");
		parrot.eat();
		parrot.breathe();
		parrot.fly();
		
		Penguin skipper = new Penguin("Skipper");
		skipper.fly();*/
		
		// TEST SEARCH TREE
		SearchTree tree = new SearchTree(null);
		
		// String stringData = "5 7 3 9 8 2 1 0 4 6";
		 String stringData = "Darwing Brisbane Perth Merbourne Camberra Adelaide Sydney Camberra";
		
		String[] data = stringData.split(" ");
		for(String s : data){
			tree.addItem(new Node(s));
		}
		
		tree.traverse(tree.getRoot()); 		// prints out everything ordered, so cool!
		
		// code to test removeItem()
		/*tree.traverse(tree.getRoot());
		tree.removeItem(new Node("3"));
		tree.traverse(tree.getRoot());

		tree.removeItem(new Node("5"));
		tree.traverse(tree.getRoot());

		tree.removeItem(new Node("0"));
		tree.removeItem(new Node("4"));
		tree.removeItem(new Node("2"));
		tree.traverse(tree.getRoot());

		tree.removeItem(new Node("9"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("8"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("6"));
		tree.traverse(tree.getRoot());
		tree.removeItem(tree.getRoot());
		tree.traverse(tree.getRoot());
		tree.removeItem(tree.getRoot());
		tree.traverse(tree.getRoot());*/
		
	}
}
