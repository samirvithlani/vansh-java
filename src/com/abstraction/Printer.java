package com.abstraction;



interface Printing{
	
	void print();
}
interface Copying extends Printing{
	
	//no
	void copy();
	
	
}

public class Printer implements Copying {

	
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		
	}

}
