package com.collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
public static void main(String[] args) {
	TreeMap<Integer, String> hm = new TreeMap<>();


	hm.put(1, "Hina");
	hm.put(2, null);
	hm.put(4, "sana");
	hm.put(3, "sama");
	hm.put(5, "Riya");


	System.out.println(hm);


	/*
	    POINTS TO BE REMEMBER ABOUT HASHMAp
	    
	    0.EXTENDS FROM ABSTRACTMAP(CLASS) , ABSTRACTMAP IMPLEMENTS (CHILD OF) MAP 
	    1.order of insertion is not maintain
	    2.STORE ONE DATA(OBJECT) IN THE FORM OF KEY VALUE PAIR
	    3.keys are unique 
	    4.value can be duplicate or same
	    5.if any key are already exist in hashMap then UPDATE with new one
	    6.AUTO SORTING FUNCTIONALITY auto sort the key according to ascending order  
	    
	    
	THERE ARE THREE METHODS FOR TRAVERSING IN HASHMAP 
	1.using a for-each loop  (ONLY SUPPORTED TYPE SAFE COLECTION) by using of Map.Enrty method
	2.using the forEach() method  
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
	is called AUTO UNBOXING 
	here we also use MAP.ENTRY 
	because they converted the element into set
	*/
	for(Map.Entry<Integer, String> el : hm.entrySet()) {
		System.out.println(el.getKey()+"  ---->   "+el.getValue());
	}



	  
	  System.out.println("----------------------For-Each Method----------------------");    

	/*    2.using the forEach() method  (JAVA 8 FEATURE)
	  
	  here we use lambda Expression for traversing
	  we can give any name for e1,e2
	  (e1,e2) is one pair (object) for hashmap
	  e1 for key
	  e2 for value  
	  */   
	  
	  
	hm.forEach((e1,e2)->{
		System.out.println(e1+" -> "+e2);
	});
	  


	System.out.println("----------------------SOME METHOD OF HASHMAP----------------------");


	System.out.println("Contains Method ->  " + hm.containsKey(1));
	System.out.println("Get Method ->  " + hm.get(2));
	System.out.println("IsEmpty Method ->  "+hm.isEmpty());
	System.out.println("Put Mathod ->  "+hm.put(5, "sana")  );
	System.out.println("Contains Value Method ->  "+ hm.containsValue("sama"));
	System.out.println("Contains Key Method ->  "+ hm.containsKey(1));
	System.out.println("Remove Method ->  " + hm.remove(3));
	//map1.clear();
	//map1.keySet();

	   
	   
	   
}
}
