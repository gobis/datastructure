package com.array;

public class ArrayRotation {
	
	// problem stmt : rotate the array by given numbers 
	
	
	public static void main(String []args){
		
	    int arr[] = {10, 12, 10, 15, 7, 6, 
                   5, 4, 2} ;
	   
	    PrintArray(arr);
	    
		 int[] newarr =  rotate(arr,arr.length,4);

		 System.out.print("\nrotate the above by 4 times");
		 
		 PrintArray(newarr);
    }
	
	// Time complexity O(n * rotate)  , space complexity O(1)
	private static int[] rotate(int[] arr , int length , int rotate){
		
		for(int i = 0 ; i< rotate ; i++){
			
			int temp = arr[0];
			
			for(int j = 0 ; j < arr.length -1 ; j++){
				arr[j] = arr[j+1];
				
			}
			arr[arr.length -1] = temp;
		}
		return arr;
	}


	
	
private static void PrintArray(int[] arr){
		
	System.out.println(" \n");
	
	for(int i = 0 ; i< arr.length ; i++){
		System.out.print(arr[i]+" ");
	}
		
	}
	

}
