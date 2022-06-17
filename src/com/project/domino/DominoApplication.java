package com.project.domino;

import com.project.domino.bank.DominoCollection;
import com.project.domino.hand.DominoHand;

public class DominoApplication {

	public static void main(String[] args) {

		DominoCollection dominoCollection = new DominoCollection();
				
//		dominoCollection.displayDominoes();
		
		DominoHand dominoHand =  new DominoHand(dominoCollection);
		
		dominoHand.displayDominoes();
		System.out.println(dominoHand.size());
		System.out.println(dominoCollection.size());
		dominoCollection.displayDominoes();
		System.out.println("Testing highest " + dominoHand.getHighest());
		System.out.println("Testing doubles " + dominoHand.getDoubles());
		System.out.println("Testing matches " + dominoHand.getMatches(4));
		System.out.println("Testing largest match 2 numbers " + dominoHand.getMatches(3, 4));
		System.out.println("Printing DominoHand after running match for 2 numbers: ");
		dominoHand.displayDominoes();
		System.out.println("Testing total " + dominoHand.total());
	}

}
