package com.calculator.geometry;

import com.calculator.interfaces.BasicOperations;

public class ReactangleArea implements BasicOperations{

	double length ;
	double breath;
	public ReactangleArea(double length , double breath) {
		this.length=length;
		this.breath=breath;
	}
	@Override
	public double Calculate() {
		// TODO Auto-generated method stub
		return length * breath;
	}

}
