package com.abhishek.isbntool;

public class ValidateIsbn {

	private static final int longISBNMultiplier = 10;
	private static final int shortISBNMultiplier = 11;
	private static final int shortISBNLength = 10;
	private static final int longISBNLenght = 13;

	public boolean checkIsbn(String isbn) {

		if (isbn.length() == longISBNLenght) {

			return isThis13DigitValidIsbn(isbn);

		} else if(isbn.length()==shortISBNLength){
			return isThis10DigitValidIsbn(isbn);
			} 
		throw new NumberFormatException("ISBN number must be 10 or 13 digit ");
				
	}

	private boolean isThis10DigitValidIsbn(String isbn) {
		int total = 0;

		for (int i = 0; i < shortISBNLength; i++) {
			if (!Character.isDigit(isbn.charAt(i))) {
				if (i == 9 && isbn.charAt(i) == 'X') {
					total += 10;
					return true;
				} else {
					throw new NumberFormatException("ISBN number contains only numeric digit ");
				}

			} else {
				total += isbn.charAt(i) * (shortISBNLength - i);
			}
		}
		return (total % shortISBNMultiplier == 0);

	}

	private boolean isThis13DigitValidIsbn(String isbn) {
		int total = 0;
		for (int i = 0; i < longISBNLenght; i++) {
			if (i % 2 == 0) {
				total += Character.getNumericValue(isbn.charAt(i));
			} else {
				total += Character.getNumericValue(isbn.charAt(i)) * 3;
			}
		}
		return (total % longISBNMultiplier == 0);

	}

}
