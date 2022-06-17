package com.project.domino.model;

public class Domino {

	// == instance variables ==
	private int d1;
	private int d2;
	
	// == constructors ==
	public Domino() {
		
	}
	
	public Domino(int d1, int d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	
	// == getters and setters ==
	public int getD1() {
		return d1;
	}

	public void setD1(int d1) {
		this.d1 = d1;
	}

	public int getD2() {
		return d2;
	}

	public void setD2(int d2) {
		this.d2 = d2;
	}
	
	// == instance methods ==
	public int sum() {
		return d1 + d2;
	}
	
	public boolean isDouble() {
		return d1 == d2;
	}
	
	public boolean getMatches(int search) {
		if(d1 == search || d2 == search) {
			return true;
		}
		return false;
	}
	
	public boolean getMatches(int search1, int search2) {
		if(d1 == search1 || d1 == search2 || d2 == search1 || d2 == search2) {
			return true;
		}
		return false;
	}
	
	// == toString() ==
	@Override
	public String toString() {
		return "" + d1 + ":" + d2 ;
	}
}
