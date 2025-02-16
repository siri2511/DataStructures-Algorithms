package com.dsa.sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//scan size of array
		int n = sc.nextInt();
		int arr[] = new int[n];
		//scan elements of array
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		selectionSortMax(arr);
		for(int num: arr) {
			System.out.print(num+ " ");
		}
	}
	//considering maximum as reference
	public static void selectionSortMax(int[] arr) {
		int temp=0;
		int max;
		for(int i=0; i<arr.length ; i++) {
			max=0;
			int n=arr.length-i-1;
			for(int j=1; j<arr.length-i ; j++) {
				if(arr[max]<arr[j]) {
					max=j;					
				}
			}
			//perform swapping
			temp=arr[max];
			arr[max]=arr[n];
			arr[n]=temp;
			
			//printing each iteration
			System.out.println("iteration "+i);
			for(int num: arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	//considering Minimum as reference
	public static void selectionSortMin(int[] arr) {
		int temp=0;
		int min;
		for(int i=0; i<arr.length-1; i++) {
			min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			//perform swapping
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
			//printing each iteration
//			System.out.println("iteration "+i);
//			for(int num: arr) {
//				System.out.print(num+" ");
//			}
//			System.out.println();
		}
	}
}
