package com.algorithms.practice;

import java.util.Arrays;

public class BubbleSort implements SortArrays {

	@Override
	public void sort(int[] arrayToSort) {
		
		System.out.println("Sorting using Bubble SortArrays Technique : " + Arrays.toString(arrayToSort));
		//Run the outer loop over the unsorted array
		//The sorted array starts from the right, as the greatest element bubbles up to the right of the array
		for(int lastUnsortedIndex = arrayToSort.length -1; lastUnsortedIndex > 1; lastUnsortedIndex --){
			
			for(int i = 0 ; i < lastUnsortedIndex ; i++){
				if(arrayToSort[i] > arrayToSort[i+1]){
					swap(arrayToSort, i , i+1);
				}
				
			}
			printArray(arrayToSort);
		}
		
		
	}
	
	private void swap(int[] arrayToSort,int i ,int j){
		if(i == j){
			return;
		}
		
		int temp = arrayToSort[i];
		arrayToSort[i]=arrayToSort[j];
		arrayToSort[j]=temp;
		
	}

	@Override
	public void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
