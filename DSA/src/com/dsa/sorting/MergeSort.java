package com.dsa.sorting;

import java.util.Scanner;

public class MergeSort {
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
		mergeSort(arr, 0, n-1);
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
	public static void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int median = (left+right)/2;
			mergeSort(arr, left, median);
			mergeSort(arr, median+1, right);
			merge(arr,left,median,right);
		}
	}
	public static void merge(int[] arr, int left, int median, int right) {
		int n1=median-left+1;
		int n2=right-median;
		int[] lArr= new int[n1];
		int[] rArr = new int[n2];
		for(int i=0; i<n1 ;i++) {
			lArr[i]=arr[left+i];
		}
		for(int j=0; j<n2; j++) {
			rArr[j]=arr[median+j+1];
		}
		int i=0;
		int j=0;
		int k=left;
		while(i<n1 && j<n2) {
			if(lArr[i]<=rArr[j]) {
				arr[k]=lArr[i];
				i++;
			}
			else {
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=lArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rArr[j];
			j++;
			k++;
		}
		
	}
}
