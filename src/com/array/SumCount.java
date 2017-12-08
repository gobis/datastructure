package com.array;

import java.util.HashMap;
import java.util.Set;

public class SumCount {
	
	public static void main(String []args){
		
		    int arr[] = {10, 12, 10, 15, -1, 7, 6, 
	                   5, 4, 2, 1, 1, 1 } ;
		    int sum = 6;
		    
    		  int count =   getPairsCount(arr,13,11);
    		  
    		  System.out.println("Pair COunt is : "+count);
		
	}

	
	static int getPairsCount(int arr[], int n, int sum)
	{
		
		int ret_value = 0;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < n ; i++){
		if(map.containsKey(arr[i])){
			Integer val = map.get(arr[i]);
			val++;
			map.put(arr[i], val);
		}else{
			map.put(arr[i], 1);
		}
			
		}
			
		
		
		System.out.println("Map : "+map);
		
		int mapCount = map.size();
		
		Object[] keys =  map.keySet().toArray();
		
		
		for(int i =0 ; i< keys.length ; i++){

			int key = (Integer)keys[i];
			
			int keyCount = 0;
			if(map.containsKey(key)){
				keyCount = map.get(key);
			}
			System.out.println("KeyCount : "+keyCount + ""
					+ " key "+ key);
			int findkey = sum-key;

			if(map.containsKey(findkey)){
				int count = map.get(findkey);
				map.remove(findkey);
			    
				ret_value+=(count*keyCount);
			}
			System.out.println("ret val : "+ret_value);
			
		}
		
		
		return ret_value;
		
	}
	
}
