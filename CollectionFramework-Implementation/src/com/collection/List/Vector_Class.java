package com.collection.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Class {
public static void main(String[] args) {
	Vector<Integer> v = new Vector<>();
	v.add(14);
	v.add(5);
	v.add(18);
	v.add(9);
	v.add(2);
	v.add(3);
	v.add(15);
	
	
	
	System.out.println(v);
	
	/*
	  POINTS TO BE REMEMBER ABOUT VECTOR
	  
	  0.CHILD OF LIST INTERFACE
	  1.vector is very old class of java it is old than collection 
	    basically java release with their first version that is
	    JAVA VERSION 1.0 at this time collection was not part of 
	    java but VECTOR is but after 1.0 they introduce 
	    JAVA VERSION 1.2 which have collection also at that time
	    they added vector in collection
	    
	  2.order of insertion is maintain
	  3.look like arrayList but thread safe
	  4.special type of traversing method we can say that tool that is ENUMERATION
	  5.size is DYNAMIC
	  6.we can access value and elements by using indexes
	  7.store null value 
	  8.we can traverse both type safe or unType safe of collections
	    
	    
	THERE ARE TOTAL SEVEN METHOD FOR TRAVERSING IN VECTOR 
	1.using an iterator
	2.using a for loop
	3.using a for-each loop
	4.using a while loop
	5.using the ListIterator class
	6.using the forEach() method 
	7.using the Enumeration  */

	
	System.out.println("----------------------For-Each Loop----------------------");

	/*	3.using a for-each loop

	here we use wrapper class because 
	collection are only store objects
	and wrapper class is the representation 
	of primitives data type like int , char and so on
	]
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
	
	
	for(Integer vector : v) {
		System.out.println(vector);
	}
	
	
	System.out.println();
	System.out.println("----------------------Iterator----------------------");	
     
	/* 1.using an iterator

	for traversing through iterator first 
	we have gain the object of iterator 
	from collection interface
	and after store into any variable 
	we can only traversing in forward direction (left to right) */

	
	Iterator<Integer> itr = v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
//  here hasNext is method which check that the element is null 
//  or present


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
//   we have to pass the size of VECTOR while creating the listIterator (in constructor)

	
	ListIterator<Integer> itr2 = v.listIterator(v.size());
	while(itr2.hasPrevious()) {
		System.out.println(itr2.previous());
	}
	
	
//  hasPrevious is method of listIterator
//  which start traversing from last index 
//  to first 

  
  System.out.println("----------------------For-Each Method----------------------");    

/*    6.using the forEach() method  (JAVA 8 FEATURE)
  
  here we use lambda Expression for traversing
  we can give any name for e */   
  
  
  
  
  v.forEach(e->{
	  if(e==null) {
		  System.out.println("Null is present");
	  }else if(e%2==0) {
		  System.out.println(e +" : Even number");
	  }else {
		  System.out.println(e +" : Odd number");
	  }
	  
	  
	  
  });
  
  System.out.println();
  
  
  System.out.println("----------------------Enumeration----------------------");    	 

  
  Enumeration<Integer> enu = v.elements();
  
  while(enu.hasMoreElements()) {
	  System.out.println(enu.nextElement());
  }
  
  
	
}
}
