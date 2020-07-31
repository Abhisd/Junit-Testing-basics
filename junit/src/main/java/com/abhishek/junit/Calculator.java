package com.abhishek.junit;

public class Calculator {

	public int addition(int a, int b) {
		return a + b;
	}

	public int subsrtaction(int i, int j) {
		return (i - j);
	}

	public int multiplication(int i, int j) {
		return (i * j);
	}

	public int division(int i, int j) {
		if (j == 0)
			throw new NumberFormatException("cannot divide by zero");
		else
			return (i / j);
	}

}
