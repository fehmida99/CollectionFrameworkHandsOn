package com.collection.Arrays;

import java.util.Arrays;

public class Arrays_Class {
public static void main(String[] args) {
	
	/* basically this class is taking care of our 
	normal primitive type array in this class 
	we have some method which we use over our normal arrays
	like indexOf , binarySearch , sort and so on 

	*/
	
	
	int arr[] = {1,2,3,4,5,6,7,8};
//	System.out.println(Arrays.binarySearch(arr, 5));
	
	//**************************************
	
//	sorting of array using enhanced for loop (also called forEach loop)
	int arr1[] = {91,42,53,14,50};
	Arrays.sort(arr1);
	
	for(  int i : arr1) {
//		System.out.print(i+" ");
	}
	

	//**************************************
	
	Arrays.fill(arr1, 45);
	
	for(int i : arr1) {
		System.out.println(i+" ");
	}
	
	
}
}