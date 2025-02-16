package com.dsa.sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//scan size of array
		int n = sc.nextInt();
		int arr[] = new int[n];
		//scan array elements
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	//Bubble Sort Logic
	public static void bubbleSort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
