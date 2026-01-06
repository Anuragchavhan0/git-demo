package com.exception;

import java.util.Scanner;

class Bank23{
	int accNo = 1234;
	int password = 4321;
	
}
class ATM41 extends Bank23{
	int user_accNo ;
	int userPass ;
//	
//	public ATM21 (int user_accNO , int userPass) {
//		this.user_accNo=user_accNo;
//		this.userPass = userPass;
//		this.accNo=accNo;
//		this.password=password;
//	}
	
	void acceptInfo() {
		Scanner input = new Scanner( System.in);
		System.out.println("Enter account number     ");	
		user_accNo = input.nextInt();
		System.out.println("enter your pass ");	
		userPass = input.nextInt();
	}
	
	void verify() {
		if( accNo == user_accNo && password ==userPass) 
		{
			System.out.println("Account verified  ");	
		}
		else 
		{
		//	System.out.println("Account  Not verified !!   ");	
		}
	}		
}
public class BankAppCustomizaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ATM41 at = new ATM41();
		 at.acceptInfo();
		 at.verify();
	}

}
