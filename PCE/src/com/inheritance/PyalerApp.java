package com.inheritance;

class Player{
	String name;
	int age;
	String gender;
}

class FootBall extends Player{
	int goals;
	int assist;
	
	public FootBall(String name , int age , String gender , int goals , int assist) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.goals=goals;
		this.assist=assist;
	}
	
	public int getGoals() {
		return goals;
	}
	public int getAssist() {
		return assist;
	}
	public String getName() {
		return name;
	}
}
public class PyalerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootBall fb = new FootBall("anurag",21,"Male",15,3);
		System.out.println(fb.getName());
		System.out.println(fb.getGoals());
		System.out.println(fb.getAssist());
	

		
	}

}
