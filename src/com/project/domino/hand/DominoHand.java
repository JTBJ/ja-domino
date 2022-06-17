package com.project.domino.hand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.project.domino.bank.DominoCollection;
import com.project.domino.model.Domino;

public class DominoHand {

	// == instance variables ==
	private List<Domino> list;
	
	// == constructors ==
	public DominoHand(DominoCollection dominoCollection) {
		list = new ArrayList<>();
		for(int i = 0; i < 7; i++) {
			list.add(dominoCollection.remove(new Random()
					.nextInt(dominoCollection.getList().size() - 1)));
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
	public int size() {
		return list.size();
	}
	
	public Domino remove(int index) {
		return list.remove(--index);
	}
	
	public void displayDominoes() {
		for(Domino domino : list) {
			System.out.println(domino);
		}
	}
	
	public Domino getHighest() {
		return list.stream().max((d1, d2) -> ((Integer)d1.sum()).compareTo(((Integer)d2.sum()))).get();
	}
	
	public String getDoubles() {
		List<Object> asList = Arrays.asList(list.stream().filter(d -> d.isDouble()).toArray());
		if(asList.size() == 0) {
			return "There are no doubles in this hand";
		}else {
			return "" + asList;
		}
	}
	
	public String getMatches(int search) {
	    List<Object> asList = Arrays.asList(list.stream().filter(d -> d.getMatches(search)).toArray());
	    if(asList.size() == 0) {
	        return "There are no matches in this hand for the provided number";
		}else {
			return "" + asList;
		}
	}
	
	public Domino getMatches(int search1, int search2) {
		Domino removeLargest = null;
		try {
		    removeLargest = list.remove(list.indexOf(list.stream().filter(d -> d.getMatches(search1, search2)).max((d1, d2) -> ((Integer)d1.sum()).compareTo(((Integer)d2.sum()))).get()));
    		if(removeLargest == null) {
    			return new Domino(-1, -1);
    		}else {
    			return removeLargest;
    		}
		} catch(Exception e) {
		    return new Domino(-1, -1);
		} finally {
		}
	}
	
	public int total() {
		return list.stream().filter(d -> d != null).mapToInt(d -> d.sum()).sum();
	}
	
	// == toString() ==
	@Override
	public String toString() {
		return "DominoHand [list=" + list + "]";
	}
}
