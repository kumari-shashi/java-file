package com.tyss.collection.arralylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		 /* Array Declaration and initialization*/
//		  String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
//
//		  /*Array to ArrayList conversion*/
//		  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
//
//		  /*Adding new elements to the converted List*/
//		  citylist.add("New City2");
//		  citylist.add("New City3");
//
//		  /*Final ArrayList content display using for*/
//		  for (String str: citylist)
//		  {
//			System.out.println(str);
//	       }
		
		
		
		/* Array Declaration and initialization*/
	    String array[]={"Hi", "Hello", "Howdy", "Bye"};

	    /*ArrayList declaration*/
	    ArrayList<String> arraylist= new ArrayList<String>();

	    /*Conversion*/
	    Collections.addAll(arraylist, array);

	    /*Adding new elements to the converted List*/
	    arraylist.add("String1");
	    arraylist.add("String2");

	    /*Display array list*/
	    for (String str: arraylist)
	    {
	 	System.out.println(str);
	    }
	      }
	}
		
