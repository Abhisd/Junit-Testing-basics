package com.abhishek.junit;

import java.util.Scanner;


public class UniqueString {

	

		public  boolean isUnique(String str) {
			//total ASCII characters are 128. 
			if(str.length()>128) return false;
			
			boolean[] char_set=new boolean[128];
			for(int i=0;i<str.length();i++) {
				int val=str.charAt(i);
				//System.out.println(val);
				if(char_set[val]) {	//already found this character in string.
					return false;
					}
				char_set[val]=true;
			}
			return true;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the String");
				String str=sc.nextLine();
				UniqueString us=new UniqueString();
				System.out.println(us.isUnique(str));
		}

	}
