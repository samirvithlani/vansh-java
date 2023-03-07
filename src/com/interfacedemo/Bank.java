package com.interfacedemo;
interface Gov{

	void tax();
}
interface State{
	
	void grant();
}


public class Bank implements State,Gov{

	
	public void tax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void grant() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Gov g = new Bank();
		g.tax();
		State s  = new Bank();
		s.grant();
				
	}

}
