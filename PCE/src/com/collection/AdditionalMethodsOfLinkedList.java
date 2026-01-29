package com.collection;

import java.util.LinkedList;

public class AdditionalMethodsOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll= new LinkedList();
		ll.add(10);
		ll.add(10);
		ll.add(50);
		ll.add(89);
		ll.add(45);
		ll.push(45);
		System.out.println(ll);
		ll.get(2);
		
		// stack 
		LinkedList ll2= new LinkedList();
		ll2.push(10);
		ll2.push(20);
		ll2.push(30);
		ll2.add(2,44);
		System.out.println(ll2);
		ll2.pop();
		System.out.println(ll2);
		System.out.println(ll2.peek());
		System.out.println(ll2.peekFirst());
		System.out.println(ll2.peekLast());
		System.out.println(ll2.poll());
		System.out.println(ll2);


	}
}
