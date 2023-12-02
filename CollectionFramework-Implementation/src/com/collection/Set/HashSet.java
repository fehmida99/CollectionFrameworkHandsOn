package com.collection.set;

import java.util.Iterator;

public class HashSet {
	public static void main(String[] args) {
		java.util.HashSet<Integer> hset = new java.util.HashSet<>();

		hset.add(18);
		hset.add(15);
		hset.add(9);
		hset.add(8);
		hset.add(118);
		hset.add(151);
		hset.add(93);
		hset.add(8);

		System.out.println(hset);

		/*
		 * POINTS TO BE REMEMBER ABOUT HASHSET
		 * 
		 * 0.CHILD OF SET INTERFACE 1.store only unique elements 2.order of insertion is
		 * not maintain 3.size is DYNAMIC 4.store the elements in random order 5.we can
		 * not access the elements by index (not index-basing collection) 6.if we want
		 * to access elements of hashSet so first we have to converted into arrayList
		 * 7.we can traverse both type safe or unType safe of collections 8.we can store
		 * NULL also
		 * 
		 * 
		 * 
		 * //********************************************************** THERE ARE TOTAL
		 * THREE METHOD FOR TRAVERSING IN HASHSET 1.using a for-each loop (ONLY
		 * SUPPORTED TYPE SAFE COLECTION) 2.using an iterator 3.using the forEach()
		 * method
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

		for (Integer set : hset) {
			System.out.println(set);
		}

		System.out.println();
		System.out.println("*****Lets see about Iterator for traversing****");
		/*
		 * 2.using an iterator
		 * 
		 * for traversing through iterator first we have gain the object of iterator
		 * from collection interface and after store into any variable we can only
		 * traversing in forward direction (left to right)
		 */

		Iterator<Integer> itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// here hasNext is method which check that the element is null
		// or present

		System.out.println();
		System.out.println("*****Lets see about For-Each Method for traversing****");
		/*
		 * 3.using the forEach() method (JAVA 8 FEATURE)
		 * 
		 * here we use lambda Expression for traversing we can give any name for e
		 */

		hset.forEach(e -> {
			System.out.println(e);
		});

		// To add all type of element like string integer (NON TYPE Safe):
		System.out.println("*****Lets see about For-Each Method(UNTYPE SAFE) for traversing****");

		System.out.println();
		java.util.HashSet hs = new java.util.HashSet();

		hs.add("Hina");
		hs.add(1);
		hs.add(1345678122);
		hs.add(5.8);
		hs.add(true);
		hs.add(39.54f);
		hs.add("End");

		hs.forEach(e -> {
			System.out.println(e);
		});

	}
}
