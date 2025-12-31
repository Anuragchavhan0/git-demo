package com.polymorphism;

public class DenfenceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duty(new Navy());
		duty(new Army());
		duty(new Airforce());
		
	}
	
	static void duty(Securityforce s) {
		s.job();
		
	}

}



class Securityforce{

 void job()
	{
	 System.out.println("protect the country");
		
	}
 
}
class Army extends Securityforce{
 void job()
	{
	 System.out.println("protect the land");
		
	}
 
 String usetank()
 {
	 String b="uses tanks";
	 return b;
 }
 
}
class Navy extends Securityforce{
void job()
{
System.out.println("protect the ocean");
	
}

String useships()
 {
	String f=("uses ships");
	return f;
 }
 
}
class Airforce extends Securityforce{
void job()
{
	System.out.println("protect the air ");
	
}
String usejets()
 {
	String g= "uses jets";
	return g;
 }
 
}