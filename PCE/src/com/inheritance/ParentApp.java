package com.inheritance;

public class ParentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Child c = new Child();
	System.out.print(c.a);
	System.out.println("--------------");
	c.disp();

	}
	

}
class Parent{
	int a = 10 ;
	int b=20;
	 void disp() {
		 System.out.println(a);
		 System.out.println(b);
	 }
}	 
class Child extends Parent{
	

}
