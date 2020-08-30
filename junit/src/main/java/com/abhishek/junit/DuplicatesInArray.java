package com.abhishek.junit;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesInArray {
	
	public int countDuplicates(int arr[],int n) {
		int count=0;
		int[] updated=new int[n];
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					updated[i]=arr[i];
					
					
				}
				
				
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(updated[i]);
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		DuplicatesInArray da=new DuplicatesInArray();
		System.out.println(da.countDuplicates(arr, n));

	}

}
