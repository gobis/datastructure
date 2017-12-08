package com.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class FindDuplicates {
	
	
	static ArrayList<Node> addList ;
	static ArrayList<Node> DuplicateList ;
	static TreeMap treemap ;
	static HashMap hashmap ;
	static int maxObject = 100000;
	
	public static void main(String[] args) {
		
		addList = new ArrayList<Node>();
		DuplicateList = new ArrayList<Node>();

		
		treemap = new TreeMap<Node, Node>();
		hashmap = new HashMap<Node, Node>();
		
		addList.clear();
		DuplicateList.clear();
		
		generateObject();
		
		UsingTreeMap(false);
		UsingHashmap(false);
		

	/*	generateDuplicateRecords();
		UsingTreeMap(true);
		UsingHashmap(true);*/
		
	}
	
	
	
	private static void UsingTreeMap(boolean isDuplcateList){
		
		
		long startms = System.currentTimeMillis();
		System.out.println("Start - treemap");
		
		for (Node node : addList) {
			if(!treemap.containsKey(node)){
			treemap.put(node, node);
			}else{
				System.out.println("Tree duplicate " + node.val );
			}
		}		
		
		System.out.println("End - treemap taken " +( System.currentTimeMillis() - startms));
		
	}
	
	private static void UsingHashmap(boolean isDuplcateList){
		
		
		long startms = System.currentTimeMillis();
		System.out.println("Start - HashMap");
		
		for (Node node : addList) {
			if(!hashmap.containsKey(node)){
			hashmap.put(node, node);
			}else{
				System.out.println("Hashmap duplicate " + node.val );
			}
		}		
		
		System.out.println("End - HashMap taken " +( System.currentTimeMillis() - startms) );
		
	}
	
	
	private static  void generateObject(){
				
		for(int i = 0 ; i < maxObject ; i++){
			addList.add(new Node(i,null,null));
		}
		
		generateDuplicateRecords();
	}
	
	
	private static void generateDuplicateRecords(){
		
		for(int i = 0 ; i < 1000 ; i++){
			int duplicate = ThreadLocalRandom.current().nextInt(1, maxObject );
			addList.add(new Node(duplicate,null,null));
			// System.out.println("duplicate " +duplicate);
		}
		
		
		
	}

}
