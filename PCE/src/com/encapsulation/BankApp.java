package com.encapsulation;
import java.util.Scanner;

class Bank{
	private int balance;
	public void setbalance(int bal) {
		bal=balance ;
	}
	public int getbalance() {
		return balance;
	}
	
}
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese Enter amount to diposite  : ");
		Bank b = new Bank();
		int bal = sc.nextInt();
		b.setbalance(bal);
		System.out.println("your current balance is: "+ b.getbalance());
		
		System.out.println("Plese Enter the amount to widraw : ");
		int w = sc.nextInt();
		int upd_bal=b.getbalance()-w;
		b.setbalance(upd_bal);
		System.out.println("your current balance is: "+ b.getbalance());
		
		
	
		sc.close();
		
		

	}

}
