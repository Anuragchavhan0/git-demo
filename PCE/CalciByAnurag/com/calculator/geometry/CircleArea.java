package com.calculator.geometry;

import com.calculator.interfaces.BasicOperations;

public class CircleArea implements BasicOperations{

	public double radius ;
	
	public CircleArea(double radius) {
		this.radius=radius;
	}
	
	@Override
	public double Calculate() {
		
		return Math.PI * radius*radius;
	}
	

}
