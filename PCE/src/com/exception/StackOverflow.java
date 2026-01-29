package com.exception;




public class StackOverflow {

	public static void main(String[] args) {
		disp();

	}
	static void disp() {
		System.out.println(" hello from disp ");
		try {
			disp();
		}catch(Error e ) {
			System.out.println(" Errror handled  ");

		}
	}

}
