package com.dsa.sorting;

import java.util.Scanner;

public class OptimizedBubbleSort {
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
		optimizedBubbleSort(arr);
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void optimizedBubbleSort(int[] arr) {
		boolean swapped = false;
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
				if(swapped!=true) {
					break;
				}
			}
		}
		
	}
}
