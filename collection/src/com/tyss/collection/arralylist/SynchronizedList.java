package com.tyss.collection.arralylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedList {

//	public static void main(String[] args) {
//		List<String> list= Collections.synchronizedList(new ArrayList<String>());
//		
//		//Adding elements to synchronized ArrayList
//	       list.add("Pen");
//	       list.add("NoteBook");
//	       list.add("Ink");
//	       
//	       System.out.println("Iterating synchronized ArrayList:");
//	       synchronized(list) {
//	       Iterator<String> iterator = list.iterator(); 
//	       while (iterator.hasNext())
//	          System.out.println(iterator.next());
//	       }
//		}
	
	
	//other way to make arraylist synchronized
	
	public static void main(String[] args){
	    CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

	    //Adding elements to synchronized ArrayList
	    al.add("Pen");
	    al.add("NoteBook");
	    al.add("Ink");

	    System.out.println("Displaying synchronized ArrayList Elements:");
	    //Synchronized block is not required in this method
	    Iterator<String> iterator = al.iterator(); 
	    while (iterator.hasNext())
	       System.out.println(iterator.next());
	  }
	
	
}
