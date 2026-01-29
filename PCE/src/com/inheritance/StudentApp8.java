package com.inheritance;


class Student8 {
	Heart H= new Heart("blood",300);
	Void hasA(Bike b) {
		System.out.println(b.GetBrand());
		System.out.println(b.GetPrice());
		System.out.println(b.GetColor());
		return null;
	}
}

class Heart{
	String job;
	int Weight;
	
     public Heart(String job , int Weight) {
		this.job = job;
		this.Weight=Weight;
	}
     
    public String GetBrand(){
    	return job;
    	
    }
    public int GetWeight(){
    	return Weight;
    }
}

class Bike{
	String Brand;
	int Price;
	String color;
	
    public Bike(String Brand , int Price , String color) {
		this.Brand=Brand;
		this.Price=Price;
		this.color=color;
	}
    public String GetBrand(){
    	return Brand;
    }
    public int GetPrice(){
    	return Price;
    }
    public String GetColor(){
    	return color;
    }
}

public class StudentApp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Student8 s= new Student8();
		 Bike B1  =  new Bike("Hero",100000,"black");
		 System.out.println(B1.GetBrand());
		 System.out.println(B1.GetColor());
		 System.out.println( B1.GetPrice());
		 s=null;
		

	}

}
