package com.project.domino.bank;

import java.util.ArrayList;
import java.util.List;

import com.project.domino.model.Domino;

public class DominoCollection {

	// == instance variables ==
	private List<Domino> list;
	
	// == constructors ==
	public DominoCollection() {
		list = new ArrayList<>();
		for(int i = 0; i < 7; i++) {
			for(int j = i; j < 7; j++) {
				if(i <= 6) {
					if(j <= 6) {
						list.add(new Domino(i, j));
					}
				}
			}
		}
	}
	
	// == getters and setters ==
	public List<Domino> getList() {
		return list;
	}

	public void setList(List<Domino> list) {
		this.list = list;
	}
	
	// == instance methods ==
	public void displayDominoes() {
		for(Domino domino : list) {
			System.out.println(domino);
		}
	}
	
	public int size() {
		return list.size();
	}
	
	public Domino remove(int index) {
		if(index == 0 || index == -1) {
			index = 0;
			return list.remove(index);
		}
		return list.remove(--index);
	}
	
	// == toString() ==
	@Override
	public String toString() {
		return "DominoCollection [list=" + list + "]";
	}
}
