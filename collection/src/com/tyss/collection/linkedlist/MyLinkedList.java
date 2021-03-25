package com.tyss.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	
	//Adding elements to the Linked list
    list.add("Steve");
    list.add("Carl");
    list.add("Raj");

    //Adding an element to the first position
    list.addFirst("Negan");

    //Adding an element to the last position
    list.addLast("Rick");

    //Adding an element to the 3rd position
    list.add(2, "Glenn");
    
  //Removing First element Same as list.remove(0);
    list.removeFirst();

    //Removing Last element
    list.removeLast();
    
  //removing 2nd element, index starts with 0
    list.remove(1);


    //Iterating LinkedList
    Iterator<String> iterator=list.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
	}

}
