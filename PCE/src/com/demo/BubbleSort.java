package com.demo;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10 , 30 ,50, 20, 40 };
		
			for(int i = 0;i<a.length;i++) {
				
				for( int j=0;j<a.length-1;j++) {
					
					if((a[j]>a[j+1]))
					{
						int temp =a[j];
						a[j]= a[j+1];
						a[j+1]= temp;
					}
				}
	
			}
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			
			}
	}

}
