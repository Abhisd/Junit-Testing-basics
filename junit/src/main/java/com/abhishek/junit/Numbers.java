package com.abhishek.junit;

public class Numbers {

	private boolean flag = true;

	public boolean isPrime(int n) {

		for (int i = 2; i <= n / 2; i++) {
			int temp = n % i;
			if (temp == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			return true;
		else
			return false;

	}

	public boolean isEven(int i) {
		if (i % 2 == 0)
			return true;
		else
			return false;
	}

	public int summationUptoTheNumberFromOne(int n) {

		return ((n * (n + 1)) / 2);
	}

	public int sumOfDigits(int i) {
		int sum = 0;
		while (i > 0) {
			int digit = i % 10;
			sum += digit;
			i = i % 10;
		}
		return sum;
	}

	public boolean validNumberPalindrome(int i) {
		int s = i;
		int reverse = 0;
		while (i != 0) {
			int rem = i % 10;
			reverse = reverse * 10 + rem;
			i = i / 10;
		}
		if (s == reverse)
			return true;
		else
			return false;
	}

}
