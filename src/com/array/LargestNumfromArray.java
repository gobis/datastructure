package com.array;

import java.util.Collections;

public class LargestNumfromArray {
	
	

	public static void main(String []args){
		
	    int arr[] = {10, 12, 10, 15, 7} ;
	   
	    PrintArray(arr);
	    
		String val = FormLargestNum(arr);

		System.out.println("Largest num is " + val);
		 
    }
	
	
	private static String FormLargestNum(int[] arr){
		
		String val="";
		
		int largest = 0 ; 
		for(int i = 0 ; i< arr.length ; i++){
			if(largest < arr[i]){
			largest = arr[i];
			}
		}
		val =  String.valueOf(largest);
		
		return val;
	}
	
	private static void PrintArray(int[] arr){
		
		System.out.println(" \n");
		
		for(int i = 0 ; i< arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
			
		}

}
