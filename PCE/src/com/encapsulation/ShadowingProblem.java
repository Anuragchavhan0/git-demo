package com.encapsulation;
import java.util.Scanner;

class Emplyo{
	private String name;
	private int id ,salary;
	
    public Emplyo (String name , int id , int salary) {
    		this.name=name;
    		this.id=id;
    		this.salary=salary;
	}
    
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
}

public class ShadowingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=sc.nextLine();
		System.out.println("Enter your id : ");
		int id=sc.nextInt();
		System.out.println("Enter your salary : ");
		int salary=sc.nextInt();
		
		Emplyo s1 = new Emplyo(name,id,salary);
		System.out.println(" your name : " + s1.getName());
		System.out.println("your Id : "+ s1.getId());
		System.out.println("Enter Salary  : "+ s1.getSalary());
		
		sc.close();

	}

}
