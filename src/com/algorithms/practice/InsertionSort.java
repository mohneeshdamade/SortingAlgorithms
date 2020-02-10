package com.algorithms.practice;

import java.util.Arrays;

/**
 * Insertion sort algorithm divides the array in sorted and unsorted array
 * logically. It traverses the sorted array from right to left to find out the
 * correct position for the new element While inserting the new element it will
 * find the correct position by comparing the values in the sorted array and
 * shift the values greater to the new element to the right of the array.
 * 
 * Time complexity : O(n2) Quadratic
 * 
 * @author Mohneesh
 *
 */
public class InsertionSort implements SortArrays {

	@Override
	public void sort(int[] arrayToSort) {

		// Iterate the array from left to right assume that the 0th element is
		// already sorted and in its correct position
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrayToSort.length; firstUnsortedIndex++) {

			int newElement = arrayToSort[firstUnsortedIndex];
			int i;
			
			for(i = firstUnsortedIndex ; i > 0 && arrayToSort[i -1 ] > newElement ;i--){
				//Shift the elements
				arrayToSort[i] = arrayToSort[i - 1];
			}
			
			arrayToSort[i] = newElement;
			printArray(arrayToSort);
		}
	}

	@Override
	public void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
