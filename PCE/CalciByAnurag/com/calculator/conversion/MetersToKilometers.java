package com.calculator.conversion;

import com.calculator.interfaces.BasicOperations;

public class MetersToKilometers extends Unit implements BasicOperations {
	
	public MetersToKilometers(double unit) {
		this.unit=unit;
	}
	@Override
	public double Calculate() {
		// TODO Auto-generated method stub
		return unit/1000;
	}

}
