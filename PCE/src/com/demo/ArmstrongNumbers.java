package com.demo;
import java.util.Scanner;


public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want check if it's a Armstromgnumber ornot ?");
		int num = sc.nextInt();
		
	        int original = num;
	        int temp = num;
	        int digits = 0;
	        int sum = 0;

	        // Step 1: Count digits
	        while (temp > 0) {
	            digits++;
	            temp = temp / 10;
	        }
	        temp=num;
	        
	     // Step 2: Calculate Armstrong sum
	        while (temp > 0) {
	            int digit = temp % 10;
	            int power = 1;

	            // digit ^ digits (manual power)
	            for (int i = 1; i <= digits; i++) {
	                power = power * digit;
	            }

	            sum = sum + power;
	            temp = temp / 10;
	        }
	     // Step 3: Check result
	        if (sum == original) {
	            System.out.println("Armstrong Number");
	        } else {
	            System.out.println("Not an Armstrong Number");
	        }

	}

}
