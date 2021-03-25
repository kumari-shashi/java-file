package com.tyss.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
	
		 // HashSet declaration
	      HashSet<String> hset = new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

//	      hset.clear();   clear the hashset
	      //Displaying HashSet elements
	      System.out.println(hset);
	      
	      Iterator<String> it = hset.iterator();
	      while(it.hasNext()){
	         System.out.println(it.next());
	      }
	      
	      // Creating an Array
	      String[] array = new String[hset.size()];
	      hset.toArray(array);
	  
	      // Displaying Array elements
	      System.err.println("Array elements: ");
	      for(String temp : array){
	         System.out.println(temp);
	      }

	}

}
