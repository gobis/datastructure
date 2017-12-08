package com.array;

public class DutchNationFlagProblem {
	
	public static void main(String []args){
		
	    int arr[] = {0, 2, 1, 1, 2, 1, 
                    1,2,0} ;
	   
	    PrintArray(arr);
	    
		 int[] newarr =  ArrangeArray(arr,arr.length);

		 System.out.print("\nSort array 0,1,2  ");
		 
		 PrintArray(newarr);
    }

	
	
	// i = 0 ; j = 1 ; k =2 
	private static int[] ArrangeArray(int[] arr,int length){
		
		int i = 0,j = 0 ; int k = length -1 ;
		
		while(j<=k){
			
			if(arr[j] == 0) {
				// swap i & j 
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;j++;
			}else if(arr[j] == 1){
				j++;
			}else if(arr[j] == 2){
				
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				k--;
			}
			
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
