package com.collection.set;

import java.util.Iterator;

public class TreeSet {
	public static void main(String[] args) {
		java.util.TreeSet<Integer> tree1 = new java.util.TreeSet<>();

		tree1.add(1);
		tree1.add(0);
		tree1.add(90);
		tree1.add(3);
		tree1.add(2);
		tree1.add(10);
		tree1.add(5);
		tree1.add(6);
		tree1.add(-1);
//	tree1.add(null);

		System.out.println(tree1);
		System.out.println();
		/*
		 * 
		 * POINTS TO BE REMEMBER ABOUT TREESET
		 * 
		 * 0.IT IMPLEMENTS (CHILD OF) NAVIGATIONAL SET(EXTEDS FROM SORTED SET) 1.store
		 * only unique elements 2.order of insertion is not maintain because they store
		 * the element in ascending order 3.store the elements in ascending order (lower
		 * to higher) 4.we can give custom sorting or custom insertion process
		 * also(CUSTOM SORTING ALGO) 5.we can not access elements by using index 6.size
		 * is DYNAMIC 7.if we want to access elements of hashSet so first we have to
		 * converted into arrayList 8.we can traverse both type safe or unType safe of
		 * collections 9.it implements (child of) SORTEDSET interface 10.NULL value is
		 * not supported, we can not store null in treeSet
		 * 
		 * 
		 * 
		 * 
		 * 
		 * THERE ARE TOTAL SIX METHOD FOR TRAVERSING IN LINKEDLIST
		 * 
		 * 1.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION) 2.using an
		 * iterator 3.using the forEach() method
		 */

		System.out.println("*****Lets see about For-Each Loop for traversing****");
		System.out.println();

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

		for (Integer el : tree1) {
			System.out.println(el);
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
		System.out.println();
		Iterator<Integer> itr = tree1.iterator();

		// here hasNext is method which check that the element is null
		// or present

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------------For-Each Method----------------------");

		/*
		 * 3.using the forEach() method (JAVA 8 FEATURE)
		 * 
		 * here we use lambda Expression for traversing we can give any name for e
		 */

		tree1.forEach(e -> {
			System.out.println(e);
		});

	}
}
