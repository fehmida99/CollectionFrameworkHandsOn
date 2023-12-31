package com.collection.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Array_Deque {
public static void main(String[] args) {
	ArrayDeque<Integer> que = new ArrayDeque<>();
	que.add(1);
	que.add(5);
	que.add(7);
	que.add(9);
	que.offerFirst(2);
	
	System.out.println(que);
	
	
	/*  
	POINTS TO BE REMEMBER ABOUT ARRAYDEQUE

	 1.allow duplicate elements
	 2.order of insertion is maintain 
	 3.we can store only one data type variable(HOMOGENIOUS) we can say that 
	   priority queue is always TYPE SAFE  
	 4.highly optimized array with extra functionalities like offerLast, pollFirst and so on  
	 5.NULL value is not supported, we can not store null in arrayDeque 
	 6.size is DYNAMIC
	 7.we can traverse both type safe or unType safe of collections
	   	
	    	

	    ADD METHOD          : if the element added successfully so they return true else throw exception
		OFFER METHOD        : if the element added successfully so they return true else return false
		OFFER LAST METHOD   : insert from the right side that is from the last true else return false
		OFFER FIRST METHOD  : insert from the left side that is from the start true else return false
		ADD FIRST METHOD    : insert from the left side that is from the start they return true else throw exception
		ADD LAST METHOD     : insert from the right side that is from the last they return true else throw exception
		
		
		ELEMENT METHOD      : return the head(first element) of the queue. Throw an EXECPTION if the queue is empty 
		PEEK METHOD         : return the head (first element) of the queue. Return null if the queue is empty
		PEEK LAST METHOD    : return the rear (last element) of the queue. Return null if the queue is empty
		PEEK FIRST METHOD   : return the head (first element) of the queue. Return null if the queue is empty
		
		REMOVE METHOD       : return and removes the head of the queue. Throw an EXECPTION if the queue is empty
		REMOVE FIRST METHOD : return and removes the head of the queue. Throw an EXECPTION if the queue is empty 
		REMOVE LAST METHOD  : return and removes the last element of the queue. Throw an EXECPTION if the queue is empty
		POLL NETHOD         : return and removes the head of the queue. Return null if queue is empty
		POLL FIRST METHOD   : return and removes the head of the queue. Return null if queue is empty
		POLL LAST METHOD    : return and removes the last element of the queue. Return null if queue is empty


		THERE ARE THREE METHOD FOR TRAVERSING IN LINKEDLIST 
		1.using an iterator
		2.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
		3.using the forEach() method

		  
		*/


	System.out.println("----------------------For-Each Loop----------------------");

	/*	2.using a for-each loop

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


	for(Integer el : que) {
		System.out.println(el);
	}


	System.out.println("----------------------Iterator----------------------");	

	/* 1.using an iterator

	for traversing through iterator first 
	we have gain the object of iterator 
	from collection interface
	and after store into any variable 
	we can only traversing in forward direction (left to right) */

	Iterator<Integer> itr1 = que.iterator();


	//  here hasNext is method which check that the element is null 
	//  or present

	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}





	       
	   
	   System.out.println("----------------------For-Each Method----------------------");    
	 
	/*    3.using the forEach() method  (JAVA 8 FEATURE)
	   
	   here we use lambda Expression for traversing
	   we can give any name for e */   
	   
	  que.forEach(e->{
		  System.out.println(e);
	  });


	  System.out.println("----------------------For-Each Method (NON-TYPE SAFE)----------------------");    
	  
	  
	  ArrayDeque aq2 = new ArrayDeque<>();
	  
	  aq2.add(18);
	  aq2.add("Hina");
	  System.out.println(aq2);
	 
	 System.out.println(aq2.peek());
	
}
}
