package com.demo;

class stu3 {
	String name;
	int age;
	String gender;
	
	void student() {
		System.out.println(" student ");
	}

}
public class student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu3 s1 = new stu3();
	    System.out.println("before assigning");
	    System.out.println(s1.name);
	    System.out.println(s1.age);
	    System.out.println(s1.gender);
	    System.out.println("After assigning");
	    s1.name = "arsh";
	    s1.age = 25;
	    s1.gender= "male";
	    System.out.println(s1.name);
	    System.out.println(s1.age);
	    System.out.println(s1.gender);
	    
	    

	}

}
