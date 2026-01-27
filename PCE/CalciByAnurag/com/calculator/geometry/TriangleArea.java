package com.calculator.geometry;

import com.calculator.interfaces.BasicOperations;

public class TriangleArea implements BasicOperations{

	double height;
	double base;
	public TriangleArea(double height , double base) {
		this.base=base;
		this.height=height;
		
	}
	@Override
	public double Calculate() {
		// TODO Auto-generated method stub
		return base*height*0.5f;
	}

}
