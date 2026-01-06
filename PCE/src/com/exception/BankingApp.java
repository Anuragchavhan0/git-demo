package com.exception;

import java.util.Scanner;
class Bank{
	void banking() {
		ATM card = new ATM();
		try {
			card.transaction();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("your money will be refunded within 24 hours  : ");
		}
	}
}

class ATM{
	void transaction() throws Exception{
		System.out.println(" ATM Connection  establish : ");
		Scanner sc = new  Scanner(System.in);
		System.out.print("Please Enter 1st number :   ");
		int a = sc.nextInt();
		System.out.print("Please Enter 2nd number :   ");
		int b = sc.nextInt();
		try {
		int c=a/b;
		}catch(Exception e){
		System.out.println(" exception handled by ATM  ");
		throw e;
		}
		finally {
			System.out.println(" ATM Connection  terminanated : ");
		}
		
}
}
public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank B = new Bank();
		B.banking();

	}

}
