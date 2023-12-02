package com.collection.List;

import java.util.ArrayList;
import java.util.*;

public class ArrayList_Class {
public static void main(String[] args) {
	
	//TO ADD ELEMENT IN ARRALIST :
	ArrayList<Integer> arr = new ArrayList<>();
	
	arr.add(null);
	
	int numm=1;
	while(numm<11) {
		arr.add(numm);
		numm++;
	}
	
	
	System.out.println(arr);

	
/*
 POINTS TO BE REMEMBER ABOUT ARRAYLIST :-
 
  0.CHILD OF LIST INTERFACE
  1.index basing storing 
  2.order of insertion is maintain
  3.access element by their name , index
  4.we can add  NULL value in arrayList
  5.we can use reference variable of their interface
  6.size is DYNAMIC
  7.Non-thread safe
   
   
   
 THERE ARE TOTAL SIX METHOD FOR TRAVERSING IN ARRAYLIST 
	1.using an iterator
	2.using a for loop
	3.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
	4.using a while loop
	5.using the ListIterator class
	6.using the forEach() method */
	
	System.out.println("---------- LETS SEE HOW For-Each Loop WORKS ---------");
	
/*	3.using a for-each loop
	
	here we use wrapper class because 
	collection are only store objects
	and wrapper class is the representation 
	of primitives data type like int , char and so on
	
	when we add primitive data type
	in collections they automatically 
	converted into their respective Wrapper class
	and this process is called AUTO BOXING.
	
	and we access or use the element 
	that are converted into their 
	respective Wrapper class they 
	automatically converted into
	their original data type that is
	primitive data type and this process
	is called AUTO UNBOXING */
	
	
	
	for(Integer element: arr) {
		System.out.println(element);
	}
	
	

	ArrayList<String> names = new ArrayList<>();
	
	names.add("aaliya");
	names.add("hina");
	names.add("sana");
	names.add("sama");
	names.add("zubi");
	names.add("rani");
	names.add("baby");
	names.set(0, "rubi");
//	names.add(null);  
//	names.get(numm);

	System.out.println("----------NOW LETS SEE HOW For-Each Loop WORKS with SB ---------");
	System.out.println();
 
 for(String el : names) {
	 StringBuffer sb = new StringBuffer(el);
	 System.out.println(sb+" size of name  is  "+sb.length() +"    Reverse ->    " +sb.reverse()  );
	 
 }
 
 System.out.println();
 
 
 
  
 //NOW LETS SEE HOW ITERATOR WORKS :::::
 System.out.println("---------NOW LETS SEE HOW ITERATOR WORKS--------");	
 System.out.println();
/* 1.using an iterator
 
 for traversing through iterator first 
 we have gain the object of iterator 
 from collection interface
 and after store into any variable 
 we can only traversing in forward direction (left to right) */
 
 
  Iterator<String> itr = names.iterator();
  
//  here hasnext is method which check that the element is null or present

  while(itr.hasNext()) {
	  String s = itr.next();
	  System.out.println(s);
  }
  
  
  
  
  
//NOW LETS SEE HOW ListIterator WORKS :::::
System.out.println("-----NOW LETS SEE HOW ListIterator(Backward & Forward Direction) Works ----");	
 
/*	5.using the ListIterator class
  
  by using ListIterator we can traverse in both direction 
  from left to right(forward) 
  from right to left(backward) 
  parent interface of ListIterator is iterator
  */
  
//   here listIterator is method 
//   which gain the listIterator Object
//   and after we have to use size method
//   we have to pass the size of arraylist while creating the listIterator (in constructor)
 
    
     ListIterator<String> itr2 = names.listIterator(names.size());
//    hasPrevious is method of listIterator
//    which start traversing from last index 
//    to first 
    
 
    while(itr2.hasPrevious()) {
    	System.out.println(itr2.previous());
    }
    
    
    
    
    
    System.out.println("--------NOW LETS SEE HOW For-Each Loop WORKS-(JAVA 8 FEATURE)--------");    
  
/*    6.using the forEach() method  (JAVA 8 FEATURE)
    
    here we use lambda Expression for traversing
    we can give any name for e */   
 
   
   
   names.forEach(e->{
	   System.out.println(e);
   });
   
   
   
   System.out.println("--------ADDING INTEGER IN THE ARRAYLIST--------");    

   
   ArrayList<Integer> arr2 = new ArrayList<>();
   
   arr2.add(18);
   arr2.add(14);
   arr2.add(34);
   arr2.add(23);
   arr2.add(4);
   arr2.add(45);
   arr2.add(34);
   
   System.out.println(arr2);
   
   
   
	
}	
	
}

