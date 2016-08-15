package com.turing.jdev.abstractclasses.searchtree;

public class SearchTree implements NodeList  {

	ListItem root = null;
	
	// CONSTRUCTOR
	public SearchTree(ListItem root){
		this.root = root;
	}
	
	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem item) {
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
