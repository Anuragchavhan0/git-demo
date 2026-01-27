package com.calculator.operations;

import com.calculator.interfaces.BasicOperations;

public class Division extends Variables implements BasicOperations{

	public Division(double num1 , double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	@Override
	public double Calculate() {
		// TODO Auto-generated method stub
		return num1/num2;
	}

}
