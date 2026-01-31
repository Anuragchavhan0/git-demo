package com.collection;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Serializable> al = new ArrayList<>();
		al.add(10);
		al.add("anurag");
		al.add(true);
		al.add(21.8);
		al.add('A');
		al.add(null);
		
		System.out.println(al);
		
		ArrayList<Comparable> al1 = new ArrayList<>();
		al1.add(10);
		al1.add("hfhu");
		al1.add(30);
		al1.add(21.8);
		al1.add('A');
		System.out.println(al1);
		
		al.add(2, al1);
		
		System.out.println(al);
		System.out.println(al.contains(2));
		System.out.println(al.containsAll(al1));
		al.remove(3);
		al.set(2, 78);
		System.out.println(al);
	}

}
