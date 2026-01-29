package com.demo;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key : ");
		int key =sc.nextInt();
		int a[]= {10,20,30,40,50};
		int low =0;
		int high = a.length - 1;
		int mid = (low + high)/2;
		boolean found = false;
		int idx= 0;
		
		while(low<=high) {
			
			if (a[mid]==key) {
				found = true;
				idx = mid;
				break;
				
			}
			else if(key<a[mid]) {
				high = mid - 1;
				mid = (low+high)/2;
			}
			
			else {
				low= mid+1;
				mid=(low+high)/2;
			}
			
		}
		
		if(found){
			System.out.println("The key is present : " + idx);	
		}
		else {
			System.out.println("The key is  not present : ");	
		}
		sc.close();

	}

}
