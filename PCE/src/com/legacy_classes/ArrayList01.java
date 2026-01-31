package com.legacy_classes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> v2 = new ArrayList<>();
		v2.add(100);
		v2.add(50);
		v2.add(150);
		v2.add(25);
		v2.add(75);
		v2.add(125);
		v2.add(175);
		
//		for(int i=0;i< v2.size();i++){
//			
//		}
		
//		for(Object x:v2) {
//			System.out.println(x +" ");
//		}
//		
//		
		Iterator<Integer> itr1 =v2.iterator();
		  while(itr1.hasNext()) {
			  System.out.println(itr1.next()+" ");
			  v2.add(20);
	     }
//		 Iterator itr2 =v2.listIterator();
//		  while(itr.hasNext()) {
//			  System.out.println(itr.next()+" ");
//	     }
//
//		 Iterator itr3 =v2.descendingIterator();
//		  while(itr1.hasNext()) {
//			  System.out.println(itr1.next()+" ");
//			  
//		  }
//		  
//		  Enumeration el1 =v2.elements();
//		  while(el1.hasMoreElements()) {
//			  System.out.println(el1.nextElement()+ " ");
//		  }
}
	
}
