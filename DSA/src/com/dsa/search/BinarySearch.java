package com.dsa.search;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//scan size of array
		int n = sc.nextInt();
		int arr[] = new int[n];
		//scan elements of array
		for (int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		// scan element to be found
		int target = sc.nextInt();
		sc.close();
		int result = binarySearch(arr,target);
		if(result>=0) {
			System.out.println("Element found at index: "+result);
		}
		else {
			System.out.println("Element not found.");
		}
		
	}
	//binary search logic
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length -1;
		while(left<=right) {
			int mid=(left+right)/2;
			if (arr[mid]==target) {
				return mid;
			}
			else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return -1;
	}
}
