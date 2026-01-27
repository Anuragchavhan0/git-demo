package com.calculator.geometry;

import com.calculator.interfaces.BasicOperations;

public class SquareArea implements BasicOperations {
	double side;
	public SquareArea(double side) {
		this.side=side;
	}
	@Override
	public double Calculate() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
