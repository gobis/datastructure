package com.sort;

public class QuickSort {
	
	
	 public static void main(String a[]){
         
	         int[] arr1 = {10,34,2,56,7,67,88,42};
//	        int[] arr1 = {10,34,2,56,213,98,88,42};
	        quickSort(arr1,0,arr1.length-1);
	        for(int i:arr1){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    }
	 
	
	static int partition(int arr[], int left, int right)
     {
		
		  System.out.print("left "+left+" right "+right + " \n");
		// below is working code 
		
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		
		return i;
	}
	 
	
	static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
}
