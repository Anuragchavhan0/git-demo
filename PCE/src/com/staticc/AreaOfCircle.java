package com.staticc;
import java.util.Scanner;

class Area{
	static float pi=3.14f;
	float rad;
	public Area (float rad) {
		this.rad = rad;	
	}
	float disp() {
		float sum= pi*rad*rad;
		return sum;
	}
}

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the radius of circle : ");
		float rad = sc.nextFloat();
		Area a = new Area(rad);
		System.out.println(a.disp());

	}

}
