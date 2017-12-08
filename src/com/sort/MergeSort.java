package com.sort;

public class MergeSort {
	
	
	public static void main(String a[]) {

		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		// int[] arr1 = {10,34,2,56,213,98,88,42};
		MergeSort(arr1);
		for (int i : arr1) {
			System.out.print(i);
			System.out.print(", ");
		}
	}
	
	
	
	public static void MergeSort(int[] arr){
		
		if(arr.length < 2) return;
		
		
		int mid = arr.length /2 ;
		
		int[] leftArray = new int[mid];
		int[] rightArray = new int[arr.length - mid];
		
		for(int i =0 ; i< mid ; i++){
			leftArray[i] = arr[i];
		}
		for(int i = mid+1 ; i< arr.length ; i++){
			rightArray[i] = arr[i];
		}
		
		
		
		
	}
 
	 

}
