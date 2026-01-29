package com.encapsulation;
class Student{
	private String name , Gender;
	private int age;
	
    public Student (String n , String g , int a) {
    		name=n;
    		Gender=g;
    		age=a;
	}
    
	public String getName() {
		return name;
	}
	public String getGender() {
		return Gender;
	}
	public int getAge() {
		return age;
	}
}

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name : ");
//		String n=sc.nextLine();
//		System.out.println("Enter your Gender : ");
//		String g=sc.nextLine();
//		System.out.println("Enter your age : ");
//		int a=sc.nextInt();
		
		Student s1 = new Student("anurag","male",21);
		System.out.println(" your name : " + s1.getName());
		System.out.println("your Gender : "+ s1.getGender());
		System.out.println("Enter your  : "+ s1.getAge());
			
		
	}

}

