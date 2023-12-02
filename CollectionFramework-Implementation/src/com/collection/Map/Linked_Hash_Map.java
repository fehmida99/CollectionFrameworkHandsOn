package com.collection.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linked_Hash_Map {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
	
	hm.put(1, "Hina");
	hm.put(2, null);
	hm.put(null, "sana");
	hm.put(3, "sama");
	hm.put(5, "Riya");
	
	
	System.out.println(hm);
	
	System.out.println(hm.isEmpty());
	
	hm.replace(5, "Rani");
	System.out.println(hm.size());
			
	System.out.println(hm);
	
	System.out.println();
	
	
	for (Map.Entry<Integer, String> el : hm.entrySet()) {
		System.out.println(el.getKey() + "---->" + el.getValue());
	}
	
	System.out.println();
	
	
	
	
	
	
	Set set = hm.entrySet() ;
	System.out.println(set);
	System.out.println();
	
	
	
	//to traverse the hashmap : 1, 1 value ko get karne ke liye :
	  Iterator itr = set.iterator();
	  while(itr.hasNext()) {
	 // System.out.println(itr.next());
	  
	  //To get key value :
	  Map.Entry entry = (Map.Entry) itr.next();	  
	
//	  System.out.println( entry.getKey()+" -> "+entry.getValue());
	  
	  }
	  
	  //foreachloop for getting key and value :   ShortCut way :
	  //TO GET KEY VALUE PAIR INDIVIDUALLY :
	      for(Map.Entry me : hm.entrySet()) {
	    	  System.out.println(me.getKey()+" -> "+me.getValue());
	      }
	
	
	
	
	
	
	
	
	
	
}
}
