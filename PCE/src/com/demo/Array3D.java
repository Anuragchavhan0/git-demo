package com.demo;
import  java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// taking input
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of collages : ");
		int n  = sc.nextInt();
		int a[][][] = new int[n][][];

		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number of classes : ");
			int m = sc.nextInt();
			a[i]=new int[m][];
			
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the number of Student in collage : " + (i+1) + " class" +  (j+1));
				int u = sc.nextInt();
				a[i][j]=new int[u];
				
			}
			
			//Storing the input data 
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println("College"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Class"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter marks of student:"+(k+1));
					a[i][j][k]= sc.nextInt();
					
				}
			}
			
		}
		
		//output
		
		 for(int i=0;i<a.length;i++) {
			 System.out.print("Collage : " + i+" ");
			for(int j = 0;j<a[i].length;j++) {
				 System.out.print("Class : " + j+" ");
                  for(int k=0;k<a[i][j].length;k++) {
				System.out.print( "Student "+j+" : "+a[i][j][k] + " ");
				
			   }
                  System.out.println();
		    }
			System.out.println();
			
	    }	  	
		sc.close();

	}

}
