package com.stackDS;
import  java.util.*;

public class PushAtBottom {
	
	public static void pushAtBottom1(int data , Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		pushAtBottom1(data ,s);
		s.push(top);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		pushAtBottom1(4 , s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}
