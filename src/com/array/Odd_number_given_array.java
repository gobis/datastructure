package com.array;

public class Odd_number_given_array {
	
	
	
	public static void main(String[] args) {

		int arr[] = { 13, 10,10, 12, 12, 15, 15, 17, 17 };

		int len = arr.length;
		int val = FindOddOccurance(arr, 0, len - 1);

		System.out.println(" O(logn) complexity recursive : value is " + val);
		
		findOddoccurance(arr,len);

	}
	
	private static void findOddoccurance(int[] arr , int len){
		
		int finalVal =0 ;
		for(int i = 0 ; i<len ; i++ ){
			finalVal = finalVal ^ arr[i];
		}
		
		System.out.println(" O(n) complexity , odd occurance using XOR => " + finalVal);
		
	}
	
	
	private static int FindOddOccurance(int[] arr, int start, int end) {

		if (start == end) {
			return arr[start];
		}

		int mid = (start + end) / 2;

		// if mid is even , then check with next pos
		if (mid % 2 == 0) {

			if (arr[mid] == arr[mid + 1])
				start = mid + 2;
			else
				end = mid;

			return FindOddOccurance(arr, start, end);

		} else {

			if (arr[mid] == arr[mid - 1])
				start = mid + 1;
			else
				end = mid;

			return FindOddOccurance(arr, start, end);

		}

	}

}
