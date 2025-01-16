package com.dsa.sorting;

import java.util.Scanner;

class Heap{
	int[] arr;
	int size;
	Heap(int[] arr){
		this.arr=arr;
		size=arr.length;
		buildHeap();
	}
	void buildHeap() {
		for(int i=size/2-1; i>=0; i--) {
			heapify(i);
		}
	}
	
	void heapify(int root_index) {
		int max_index=root_index;
		int child=root_index*2+1;
		if(child<size) {
			if(arr[child]>arr[max_index]) {
				max_index=child;
			}
		}
		if(child+1<size) {
			if(arr[child+1]>arr[max_index]) {
				max_index=child+1;
			}
		}
		swap(arr, root_index,max_index);
		if(root_index!=max_index) {
			heapify(max_index);
		}
	}
	void swap(int arr[], int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	int extractRoot() {
		int max=arr[0];
		arr[0]=arr[--size];
		heapify(0);
		return max;
	}
	
	int getSize() {
		return size;
	}
}

public class HeapSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//scan size of the array
		int n = sc.nextInt();
		int[] arr = new int[n];
		//scan elements of array
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Heap h = new Heap(arr);
		int k=arr.length-1;
		while(h.getSize()>0&&k>=0) {
			arr[k--]=h.extractRoot();
			}
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
}
