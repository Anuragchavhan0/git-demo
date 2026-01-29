package com.inheritance;

class Student9 {
	Heart1 H= new Heart1("blood",300);
	Brain B2 =new Brain("Operater",200);
	Void hasA(Bike1 b2) {
		System.out.println(b2.GetBrand());
		System.out.println(b2.GetPrice());
		System.out.println(b2.GetColor());
		return null;
	}
	Void hasAA(Book1 b1) {
		System.out.println(b1.GetName());
		System.out.println(b1.GetPrice());
		
		return null;
	}
}

class Heart1{
	String job1;
	int Weight;
	
     public Heart1(String job1 , int Weight) {
		this.job1 = job1;
		this.Weight=Weight;
	}
     
    public String GetJob(){
    	return job1;
    	
    }
    public int GetWeight(){
    	return Weight;
    }
}

class Brain{
	String job;
	int Weight;
	
     public Brain(String job , int Weight) {
		this.job = job;
		this.Weight=Weight;
	}
     
    public String GetJob(){
    	return job;
    	
    }
    public int GetWeight(){
    	return Weight;
    }
}



class Bike1{
	String Brand;
	int Price;
	String color;
	
    public Bike1(String Brand , int Price , String color) {
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

class Book1{
	String Name;
	int P1;
	
	
    public Book1(String name , int P1) {
		this.Name=Name;
		this.P1=P1;
		}
		
    public String GetName(){
    	return Name;
    }
    public int GetPrice(){
    	return P1;
    }
   
}


public class StudentApp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student9 s1= new Student9();
		 
		 Bike1 b2 = new Bike1("hero",10000,"black");
		 System.out.println(b2.GetBrand());
		 System.out.println(b2.GetPrice());
		 System.out.println(b2.GetColor());
		 
		 
		 Book1 b1 = new Book1("A voice",150);
		 
		System.out.println( s1.H.GetJob());
		System.out.println( s1.H.GetWeight());
		System.out.println( s1.B2.GetJob());
		System.out.println( s1.B2.GetWeight());
		
		 

		
		
		 
		

	}

}
