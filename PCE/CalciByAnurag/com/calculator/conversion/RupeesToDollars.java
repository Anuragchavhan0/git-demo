package com.calculator.conversion;

import com.calculator.interfaces.BasicOperations;

public class RupeesToDollars extends Unit implements BasicOperations {
	
	public RupeesToDollars(double unit) {
		this.unit=unit;
	}
	@Override
	public double Calculate() {
		// TODO Auto-generated method stub
		return unit/90 ;
	}

}
