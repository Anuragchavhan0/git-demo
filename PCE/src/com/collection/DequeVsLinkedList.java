package com.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeVsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque  ad = new ArrayDeque();
		long t1 = System.currentTimeMillis();
		for( int i=0;i<1000000000;i++) {
			ad.push(i);
		}
		long t2 = System.currentTimeMillis();
		
		LinkedList  al = new LinkedList();
		long t3 = System.currentTimeMillis();
		for( int i=0;i<10000000;i++) {
			al.push(i);
		}
		long t4 = System.currentTimeMillis();
		
		System.out.println(t2-t1);
		System.out.println(t4-t3);

	}

}
