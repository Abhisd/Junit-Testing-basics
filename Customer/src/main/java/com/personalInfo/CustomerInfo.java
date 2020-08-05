package com.personalInfo;

import java.util.regex.Pattern;

public class CustomerInfo {

	private String aadharNo;
	private String fName;
	private String lName;

	public CustomerInfo(String aadharNo, String fName, String lName) {
		super();
		this.aadharNo = aadharNo;
		this.fName = fName;
		this.lName = lName;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	private static Pattern aadharPattern = Pattern.compile("^[2-9]{1}[0-9]{11}$");

	public static boolean isValidAadharNo(String name) {
		java.util.regex.Matcher matcher = aadharPattern.matcher(name);
		return matcher.find();
	}

}
