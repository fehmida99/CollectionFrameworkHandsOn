package com.collection.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Linked_List {
public static void main(String[] args) {

	Queue<Integer> list1 = new LinkedList<>();
	
	list1.add(1);
	list1.add(null);
	list1.add(67);
	list1.add(67);
	list1.add(90);
	list1.add(50);
	list1.add(20);
	list1.add(-1);
	list1.add(60);
	
	System.out.println(list1);
	  list1.add(10);   // return true if added else throw exception
			list1.offer(11); //return true if added else false
			
//			System.out.println(p1.add(40.8));
			System.out.println(list1.add(40));
			System.out.println(list1);
//			list1.clear();
		    list1.element();  //return not remove
			list1.peek();    //return not remove
			
//			list1.clear();
			list1.remove();  //return and remove
			list1.poll();    //return and remove
			
			
			
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
			  8.having special methods also such as poll , pop , push , pollFirst , pollLast , peekLast , peek
			  
			  
			  
			    ADD METHOD     : if the element added successfully so they return true else throw EXCEPTION
				OFFER METHOD   : if the element added successfully so they return true else return false
				
				ELEMENT METHOD : return the head(first element) of the queue. Throw an EXECPTION if the queue is empty 
				PEEK METHOD    : return the head (first element) of the queue. Return null if the queue is empty
				
				
				REMOVE METHOD  : return and removes the head of the queue. Throw an EXECPTION if the queue is empty
				POLL NETHOD    : return and removes the head of the queue. Return null if queue is empty





			THERE ARE THREE METHOD FOR TRAVERSING IN LINKEDLIST 
			 
				1.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
				2.using an iterator
				3.using the forEach() method
				4.we can traverse both type safe or unType safe of collections    
				
				
				
				
				
				
				
				*/


			System.out.println("----------------------For-Each Loop----------------------");

			/*	1.using a for-each loop

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


			  
			  for(Integer el : list1) {
				  System.out.println(el);
			  }
			  
			  
			  
			  System.out.println("----------------------Iterator----------------------");	
			  
			  /* 2.using an iterator
			   
			   for traversing through iterator first 
			   we have gain the object of iterator 
			   from collection interface
			   and after store into any variable 
			   we can only traversing in forward direction (left to right) */
			   
			  Iterator<Integer>itr1 = list1.iterator();
			    
			  //  here hasNext is method which check that the element is null 
			  //  or present
			  
			  while(itr1.hasNext()) {
				  System.out.println(itr1.next());
			  }
			  
			    
			   

			    
			        
			   
			      
			      System.out.println("----------------------For-Each Method----------------------");    
			    
			  /*    3.using the forEach() method  (JAVA 8 FEATURE)
			      
			      here we use lambda Expression for traversing
			      we can give any name for e */   
			      
			        list1.forEach(e->{
			        System.out.println(e);
			        });
			      
			      

			     
			      
			      
			      System.out.println("----------------------For-Each Method (NON-TYPE SAFE)----------------------");
			      
//			      4.traverse unType safe of collections   
			      
			      LinkedList list4 = new LinkedList<>();
			      
			      list4.add("MATH");
			      list4.add(5.89);
			      list4.add(8);
			      list4.add(23238238239239l);
			      list4.add(true);
			      list4.add('B');
			      
			      
			      list4.forEach(el->{
			    	  System.out.println(el);
			      });
			  
			
			
			
}
}
