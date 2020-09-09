package com.abhishek.junit.Bits;

import java.util.Arrays;
import java.util.Scanner;

//Magic index in an array is an index in array which is array[index]=index
/*
 * This is the common approach that is quite slower than applying binary search on an array.
 * int magicIndex(int arr[]){
 *  for(int i=0;i<arr.length;i++){
 *  	if(arr[i]==i)return i;
 *  }
 * }
 * */

//This is the method in which binary search is used which is quite faster than common approach.
public class MagicIndex {

	int magicIndex(int arr[]) {
		Arrays.sort(arr);
		return magicIndex(arr, 0, arr.length - 1);
	}

	int magicIndex(int arr[], int start, int end) {
		if (end < start)
			return -1;

		int mid = (start + end) / 2;
		if (arr[mid] == mid) {
			return mid;
		} else if (arr[mid] > mid) {
			return magicIndex(arr, 0, mid - 1);
		} else {
			return magicIndex(arr, mid + 1, end);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the array elements");
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}
		MagicIndex index = new MagicIndex();
		System.out.println("magic index is " + index.magicIndex(arr));
	}

}
