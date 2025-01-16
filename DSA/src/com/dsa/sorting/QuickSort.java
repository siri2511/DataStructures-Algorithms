package com.dsa.sorting;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//scan number of elements in array
		int n = sc.nextInt();
		int[] arr = new int[n];
		//scan elements of array
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		quickSort(arr,0,n-1);
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
	public static void quickSort(int[] arr, int low,int high) {
		if(low<high) {
			int pivot=partition(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1 , high);
		}
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot= arr[high];
		int i=low-1;
		int temp=0;
		for(int j=low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
}
