package com.demo;

public class IsDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= { 1,2,2,3,4,5,5};
		for(int i=0;i<a.length;i++) {
			boolean isDistinct=true;
			
			for (int j=0;j<i;j++) {
				if(a[j]==a[i]) {
					isDistinct = false;
					break;
					
				}
			}
			if(isDistinct) {
				System.out.println(a[i] + "");
			}
		}

	}

}
