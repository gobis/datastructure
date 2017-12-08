package com.array;

public class FindMinMax {
	

public static void main(String []args){
		
	    int arr[] = {10, 12, 10, 15, 7, 6, 
                   5, 4, 2} ;
	   
	    Find_Min_max(arr,arr.length);
	    
    }
	
	// Time complexity O(n * rotate)  , space complexity O(1)
	private static void Find_Min_max(int[] arr , int length ){
		
		int min_so_far = arr[0];int max_so_far = arr[0];
		
		for(int i =1 ; i< length ; i++){
			
			if(arr[i] < min_so_far){
				min_so_far = arr[i];
			}
			if(arr[i] > max_so_far){
				max_so_far = arr[i] ;
			}
			
		}
		System.out.println("min value " + min_so_far+ "\n max value "+max_so_far);
	
	}


	
	
private static void PrintArray(int[] arr){
		
	System.out.println(" \n");
	
	for(int i = 0 ; i< arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
		
	}
	
	
	
}
