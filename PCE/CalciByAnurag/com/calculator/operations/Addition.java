package com.calculator.operations;

import com.calculator.interfaces.BasicOperations;

public class Addition extends Variables implements BasicOperations {

	public Addition(double num1 , double num2) {
		this.num1=num1;
		this.num2=num2;
	}

	@Override
	public double Calculate() {
		return  num1+num2;
	}
	

}
