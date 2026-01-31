package com.collection;

import java.util.TreeSet;

public class TreeSetAdditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);;
		System.out.println(ts);
		
		System.out.println(ts.floor(75)); // same & lower value
		System.out.println(ts.ceiling(75));// same & upper value 
		System.out.println(ts.lower(75));// value lower than 75 
		System.out.println(ts.higher(75));// value higher than 75
		System.out.println(ts.headSet(75));// set of lower values / set of upper ascending value
		System.out.println(ts.tailSet(75)); // set of higher values including itself
																	// set of descending value
	
	}

}
