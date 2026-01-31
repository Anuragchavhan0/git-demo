package com.EnhancedForLoops;

import java.util.ArrayList;

public class ForEachInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Comparable> al = new ArrayList<>();
		al.add(10);
		al.add("anurag");
		al.add(true);
		al.add(21.8);
		al.add('A');
		al.add(null);
		
		System.out.println(al);
		
		System.out.println("-------------- for loop-------------------");
	for (int i=0;i<al.size();i++) {
		System.out.print(al.get(i)+" ");
	}
	
	System.out.println("-------------- for each-------------------");
	for(Object num:al) {
		System.out.print(num+" ");
	}
	
	}

}
