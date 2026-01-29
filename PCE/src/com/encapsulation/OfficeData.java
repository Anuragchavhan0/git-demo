package com.encapsulation;
import java.util.Scanner;
class Emplyoee{
	private String name;
	private int id ,salary;
	
    public Emplyoee (String n , int i , int s) {
    		name=n;
    		id=i;
    		salary=s;
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


public class OfficeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String n=sc.nextLine();
		System.out.println("Enter your id : ");
		int i=sc.nextInt();
		System.out.println("Enter your salary : ");
		int s=sc.nextInt();
		
		Emplyoee s1 = new Emplyoee(n,i,s);
		System.out.println(" your name : " + s1.getName());
		System.out.println("your Id : "+ s1.getId());
		System.out.println("Enter Salary  : "+ s1.getSalary());
		
		sc.close();
	}

}
