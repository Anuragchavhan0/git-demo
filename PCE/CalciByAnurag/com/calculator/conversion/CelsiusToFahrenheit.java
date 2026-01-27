package com.calculator.conversion;

import com.calculator.interfaces.BasicOperations;

public class CelsiusToFahrenheit extends Unit implements BasicOperations{
	
	
	public  CelsiusToFahrenheit(double unit) {
		this.unit=unit;
	}

	@Override
	public double Calculate() {
		// TODO Auto-generated method stub
		return (unit*9/5)+ 32;
	}
	
	

}
