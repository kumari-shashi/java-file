package com.tyss.collection.arralylist;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
	public static void main(String[] args) {
		ArrayList<String> alist= new ArrayList();
		  alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");

	      //displaying elements
	      System.out.println(alist);

	      //Removing "Steve" and "Angela"
	      alist.remove("Steve");
	      

	      //displaying elements
	      System.out.println(alist);

	      //Removing 3rd element
	      alist.remove(2);

	      //displaying elements
	      System.out.println(alist);
	      
	     
	      
	       
	      
	      System.out.println("Number of elements in ArrayList: "+alist.size());
	      
	      Collections.sort(alist);
	    //iterating ArrayList
	      for(String str:alist)  
	         System.out.println(str); 
	}

}
