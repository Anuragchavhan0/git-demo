package com.EnhancedForLoops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DecendingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> lh = new LinkedList<>();
		lh.add(100);
		lh.add(50);
		lh.add(150);
		lh.add(25);
		lh.add(75);
		lh.add(125);
		lh.add(175);
		
	  Iterator<Integer> itr =lh.descendingIterator();
	  while(itr.hasNext()) {
		  System.out.print(itr.next()+" ");
		  
	  }
	}

}
