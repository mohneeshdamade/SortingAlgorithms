package com.algorithms.practice;

public class SortAlgorithms {

	public static void main(String[] args) {

		int[] arrayToSort = {20, 35, -15, 7, 55, 1 , -22};

//		SortArrays bubbleSort= new BubbleSort();
//		bubbleSort.sort(arrayToSort);

		
//		SortArrays selectionSort= new SelectionSort();
//		selectionSort.sort(arrayToSort);

		SortArrays insertionSort= new InsertionSort();
		insertionSort.sort(arrayToSort);
	
	}

}
