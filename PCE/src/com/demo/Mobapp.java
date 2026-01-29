package com.demo;


 class  Robot {
	String brand;
	String  Os;
	int price ;
	
	public  void displayInfo() {
		System.out.println("Robot details");
		System.out.println("brand : "+ brand);
		System.out.println("Os : "+ Os);
		System.out.println("Price : "+ price);


	}
	
}
 

public class Mobapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Robot R1=  new  Robot();
		  R1.price=1223;
		  R1.brand="hammer";
		  R1.Os="Linux";
		  
		 R1.displayInfo();		  

	}

}
