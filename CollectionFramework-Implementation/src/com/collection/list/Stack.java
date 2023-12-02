package com.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class Stack {
public static void main(String[] args) {
	
	
	java.util.Stack<Integer> st = new java.util.Stack<>();
	st.push(30);
	st.push(10);
	st.push(90);
	st.push(30);
	st.push(40);
	st.push(50);
	
	
	System.out.println(st);
	
	
	/*
	  POINTS TO BE REMEMBER ABOUT Stack
	  
	
	  1.it extends (child of) VECTOR(class)
	  2.order of insertion is maintain
	  3.special type of traversing method we can say that tool that is ENUMERATION(Because of their parent have)
	  4.size is DYNAMIC
	  5.we can access value and elements by using indexes
	  6.store null value 
	  7.special method such as peek , pop , push
	  8.follow LIFO (LAST IN FIRST OUT)  and   FILO (FIRST IN LAST OUT)
	    
	    
	   



	THERE ARE TOTAL SEVEN METHOD FOR TRAVERSING IN STACK 
	1.using an iterator
	2.using a for loop
	3.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
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
	
	for(Integer el : st) {
		System.out.println(el);
	}
	
	System.out.println("----------------------Iterator----------------------");	

	/* 1.using an iterator

	for traversing through iterator first 
	we have gain the object of iterator 
	from collection interface
	and after store into any variable 
	we can only traversing in forward direction (left to right) */
	
	
	Iterator<Integer> itr = st.iterator();
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
	//   we have to pass the size of STACK while creating the listIterator (in constructor)

	ListIterator<Integer> listitr = st.listIterator(st.size());
	while(listitr.hasPrevious()) {
		System.out.println(listitr.previous());
	}
	
	   
		//  hasPrevious is method of listIterator
		//  which start traversing from last index 
		//  to first 

		  
		  System.out.println("----------------------For-Each Method----------------------");    

		/*    6.using the forEach() method  (JAVA 8 FEATURE)
		  
		  here we use lambda Expression for traversing
		  we can give any name for e */   
		  
		   
		  st.forEach(e->{
		    
			   if(e==null) {
				   System.out.println("NULL");

			   }else {
				   if (e%2==0) {
						System.out.println(e+"  is Even" );
					}else {
						System.out.println(e+"  is Odd");
					}  
			   }
			   
		   });
		  
		  

		   System.out.println("----------------------Enumeration----------------------");    	 
			
		   Enumeration<Integer> enu = st.elements();
		   
		   while(enu.hasMoreElements()) {
			   System.out.println(enu.nextElement());
		   }
		   


		   System.out.println("----------------------SPECIAL METHODS----------------------");  
		     
		
		  System.out.println("pop--->   "+   st.pop());
		  System.out.println("peek--->  "+   st.peek());
		
		  
	
	
	
}
}
