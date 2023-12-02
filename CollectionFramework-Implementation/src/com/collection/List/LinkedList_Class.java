package com.collection.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Class {
public static void main(String[] args) {
	
	LinkedList<String> list = new LinkedList<>();
	list.add("Hina");
	list.add("Fehmida");
	list.add("Hina");
	list.add("Sana");
	list.add("Samayera");
	list.add("Shami");
	list.add("Rubi");
	list.add("Rubina");
	list.add("Shama");
	list.add("Zara");
	list.add("Pinky");
	list.set(4, "Sufi");
	System.out.println(list);
	System.out.println(list.get(1));
	
	
	
	
	/*
	  POINTS TO BE REMEMBER ABOUT LINKEDLIST
	  
	  0.CHILD OF LIST INTERFACE AND QUEUE INTERFACE(DEQUEUE INTERFACE)
	  1.order of insertion is maintain
	  2.store the element on doubly LinkedList data structure
	  3.null value is allowed
	  4.store duplicate element
	  5.size is DYNAMIC
	  6.Non-thread safe
	  7.linkedList also implements(child of) DEQUE interface.
	  
	  




	THERE ARE TOTAL SIX METHOD FOR TRAVERSING IN LINKEDLIST 
		1.using an iterator
		2.using a for loop 
		3.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
		4.using a while loop
		5.using the ListIterator class
		6.using the forEach() method
		7.we can traverse both type safe or unType safe of collections    
		*/

	
	System.out.println("----------------------For-Each Loop----------------------");

	/*	3.using a for-each loop

	here we use wrapper class because 
	collection are only store objects
	and wrapper class is the representation 
	of primitives data type like int , char and so on

	when we add primitive data type
	in collections they automatically 
	converted into their respective Wrapper class
	and this process is called AUTO BOXING

	and we access or use the element 
	that are converted into their 
	respective Wrapper class they 
	automatically converted into
	their original data type that is
	primitive data type and this process
	is called AUTO UNBOXING */
	
	
	for(String s : list) {
		System.out.println(s);
	}
	
	  System.out.println("----------------------Iterator----------------------");	
	  
	  /* 1.using an iterator
	   
	   for traversing through iterator first 
	   we have gain the object of iterator 
	   from collection interface
	   and after store into any variable 
	   we can only traversing in forward direction (left to right) */
	   
	   
	    Iterator<String> itr = list.iterator();
	    //  here hasNext is method which check that the element is null 
	    //  or present    
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	
	    System.out.println("----------------------ListIterator(Backward Direction)----------------------");	
	    
	    /*	5.using the ListIterator class
	      
	      by using ListIterator we can traverse in both direction 
	      from left to right(forward) 
	      from right to left(backward) 
	      parent interface of ListIterator is iterator
	      */
	      
	    //   here listIterator is method 
	    //   which gain the listIterator Object
	    //   and after we have to use size method
	    //   we have to pass the size of LINKEDLIST while creating the listIterator (in constructor)
	
	     ListIterator<String> li = list.listIterator(list.size());
//	      hasPrevious is method of listIterator
//	      which start traversing from last index 
//	      to first 
	     
	     while(li.hasPrevious()) {
	    	 System.out.println(li.previous());
	     }
	
	     System.out.println("----------------------For-Each Method----------------------");    
	     
	     /*    6.using the forEach() method  (JAVA 8 FEATURE)
	         
	         here we use lambda Expression for traversing
	         we can give any name for e */   
	     
	     
	     list.forEach(e->{
	    	 if(e!=null) {
	    		 StringBuffer sb = new StringBuffer(e);
	    		 System.out.println(sb+"       \t name length  is  "+sb.length()+"      reverse order ---> "+sb.reverse());
	    		 
	    	 }else {
	    		 System.out.println("Null value found");
	    	 }
	     });
	     
	     System.out.println();
	     
	     
	     
	     
	     
	     LinkedList<Integer> li2 = new LinkedList<>();
	     li2.add(61);
	     li2.add(21);
	     li2.add(10);
	     li2.add(17);
	     li2.add(18);
	     li2.add(16);
	     li2.add(41);
	     li2.add(41);
	     li2.add(71);
	     li2.add(9);
	     System.out.println(li2);
	
	     
	     
	     
	     
	
}
}
