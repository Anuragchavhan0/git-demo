package com.demo;
import java.util.Scanner;

public class CopyingArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
//		int a[]= new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=10;
//		a[3]=10;
//		a[4]=10;
		
		// 1) copying data from 1 array to another
		//int [] b =new int[a.length];
		
		//for(int i=0;i<a.length;i++) {
		  //  b[i]=a[i];	
		
		//}
	//	for(int i=0;i<a.length;i++) {
		 //   System.out.println(b[i] + "");	
		
	//	}
	
		//2) reversing data from 1 array to another
		
//		int [] b =new int[a.length];
//		int j=a.length -1;
//		for(int i=0;i<a.length;i++) {
//		    b[i]=a[i];	
//		
//		}
//		for(int i=0;i<a.length;i++) {
//		    System.out.println(b[i] + "");	
//		
//		}
		
		
		// que -  write a java code to check whethere an element given by the user is present array or not 
	
		int a[]= {10,20,30,40,50};
		System.out.println("Enter the array element : ");
		int key = sc.nextInt();
		boolean found=false;
		int idx=0;
		for(int i=0;i<a.length;i++) {
			
		if(key==a[i]) {
			found=true;
			idx=i;
			break;
			}
		}
		if(found==true) {
			System.out.println(" key found at Index  " + idx );
		}
			else {
				System.out.println("Key not founnd"); 
				
			}
		
		
		
		sc.close();
		
	}

}
