package com.algorithms.practice;

import java.util.Arrays;

/**
 * In a selection sort algorithm we start traversing the array from left to
 * right and find out the largest element in the array. Once we find the largest
 * array in the iteration , we swap it with the last element of the unsorted
 * array.
 * 
 * It is similar to bubble sort, but different in the sense that we only have to
 * swap only once per iteration unlike bubble sort.
 * 
 * Time complexity of selection sort if O(n2) Quadratic. With less number of
 * swaps than bubble sort , so it will perform generally better than bubble
 * sort.
 * 
 * @author Mohneesh
 *
 */
public class SelectionSort implements SortArrays {

	@Override
	public void sort(int[] arrayToSort) {

		System.out.println("Sorting using Selection SortArray Technique : " + Arrays.toString(arrayToSort));

		for (int lastUnsortedIndex = arrayToSort.length -1 ; lastUnsortedIndex > 1; lastUnsortedIndex--) {

			//Assume the largest element is at 0th index
			int largestElementIndex = 0;
			
			//Start the loop from 1 to find the largest element
			//We also need to check the lastUnsortedIndex since the value can be largest
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (arrayToSort[i] > arrayToSort[largestElementIndex]) {
					//Found another largest element 
					largestElementIndex = i;
				}

				//After finding the largest element Swap the largest and last unsorted index
				swap(arrayToSort, largestElementIndex, lastUnsortedIndex);

			}
			//After every iteration print the array
			printArray(arrayToSort);
		}

	}

	private void swap(int[] arrayToSort, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = arrayToSort[i];
		arrayToSort[i] = arrayToSort[j];
		arrayToSort[j] = temp;

	}

	@Override
	public void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
