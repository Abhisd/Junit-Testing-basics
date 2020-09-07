package com.abhishek.junit.Bits;

public class BinaryToString {

	public String printBinary(double n) {
		if(n>=1 || n<=0) return "Error";
		StringBuilder binary=new StringBuilder();
		double fact=0.5;
		binary.append(".");
		while(n>0) {
			if(binary.length()>=32) return "Error";
			 
			if(n>=fact) {
				binary.append(1);
				n-=fact;	
			}else
			{
				binary.append(0);
			}
			fact/=2;
		}
		return binary.toString();
	}
	
	public static void main(String[] args) {
		
		BinaryToString bs=new BinaryToString();
		System.out.println(bs.printBinary(0.625));

	}

}
