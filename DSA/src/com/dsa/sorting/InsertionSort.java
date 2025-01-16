package com.dsa.sorting;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//scan size of array
		int n=sc.nextInt();
		int[] arr = new int[n];
		//scan elements of array
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		insertionSort(arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}
