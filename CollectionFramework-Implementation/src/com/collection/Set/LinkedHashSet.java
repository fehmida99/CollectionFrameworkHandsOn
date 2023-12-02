package com.collection.set;

import java.util.Iterator;

public class LinkedHashSet {
	public static void main(String[] args) {
		java.util.LinkedHashSet<Integer> set = new java.util.LinkedHashSet<>();
		set.add(1);
		set.add(42);
		set.add(67);
		set.add(11);
		set.add(52);
		set.add(87);

		System.out.println(set);

		/*
		 * POINTS TO BE REMEMBER ABOUT LINKEDHASHSET
		 * 
		 * 1.store only unique elements 2.order of insertion is maintain 3.size is
		 * DYNAMIC 4.we can not access the elements by index (not index-basing
		 * collection) 5.if we want to access elements of hashSet so first we have to
		 * converted into arrayList 6.we can traverse both type safe or unType safe of
		 * collections 7.it extends (child of) HASHSET class
		 * 
		 * 
		 * 
		 * THERE ARE TOTAL SIX METHOD FOR TRAVERSING IN LINKEDLIST
		 * 
		 * 1.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION) 2.using an
		 * iterator 3.using the forEach() method
		 */

		System.out.println();
		System.out.println("*****Lets see about For-Each Loop for traversing****");
		/*
		 * 1.using a for-each loop
		 * 
		 * here we use wrapper class because collection are only store objects and
		 * wrapper class is the representation of primitives data type like int , char
		 * and so on
		 * 
		 * when we add primitive data type in collections they automatically converted
		 * into their respective Wrapper class and this process is called AUTO BOXING
		 * 
		 * and we access or use the element that are converted into their respective
		 * Wrapper class they automatically converted into their original data type that
		 * is primitive data type and this process is called AUTO UNBOXING
		 */

		System.out.println();
		for (Integer el : set) {
			System.out.println(el);
		}


		/*
		 * 2.using an iterator
		 * 
		 * for traversing through iterator first we have gain the object of iterator
		 * from collection interface and after store into any variable we can only
		 * traversing in forward direction (left to right)
		 */

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// here hasNext is method which check that the element is null
		// or present

		System.out.println("*****Lets see about For-Each Method for traversing****");

		/*
		 * 3.using the forEach() method (JAVA 8 FEATURE)
		 * 
		 * here we use lambda Expression for traversing we can give any name for e
		 */

		set.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("*****Lets see about For-Each Method(UNTYPE SAFE) for traversing****");
		// we can also create NON-TYPE SAFE linkedHashSet

		java.util.LinkedHashSet link2 = new java.util.LinkedHashSet();

		link2.add("Hina");
		link2.add(11);
		link2.add(6232133187l);
		link2.add(59.7);
		link2.add(true);
		link2.add("Blue");

		link2.forEach(el -> {
			System.out.println(el);
		});

	}
}
