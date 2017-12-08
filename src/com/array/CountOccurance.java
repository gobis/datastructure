package com.array;

import java.util.HashMap;

public class CountOccurance {
	

	public static void main(String []args){
		
	    int arr[] = {10, 12, 10, 15, 7, 6, 
                   5, 4, 2,16,456} ;
	    
	    CountOccurance(arr,arr.length);
	}

	
	private static void CountOccurance(int[] arr, int length) {

		HashMap<Integer, Integer> countVal = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			int key = arr[i];
			if (countVal.containsKey(key)) {

				int val =  countVal.get(key);
				countVal.put(key, ++val);
				
			}else{
				countVal.put(key, 1);
			}

		}

		
		System.out.println(countVal);
		
	}
	
	
}
