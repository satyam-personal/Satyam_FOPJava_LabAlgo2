package com.greatlearnings.algo.currencydenomination;

public class ArrayUtil {
	public static void mergeSort(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}
	public static void mergeSort(int[] arr, int right, int left) {
		if (left < right) {
			int mid = (left +right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid +1, right);
			merge(arr, left, mid, right);
		}
	}
	public static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left+1;
		int n2 = right -mid;
		int[] arrLeft = new int [n1];
		int[] arrRight = new int [n2];
		
		for (int i=0; i<n1; i++) {
			arrLeft[i] = arrLeft[i+1];
		}
		
		for (int i=0; i<n2; i++) {
			arrRight[i] = arrRight[mid+i+1];
		}
		
		int i=0, j=0, k= left;
		
		while (i < n1 && j< n2) {
			if (arrLeft[i] < arrRight[j]) {
				arr[k++] = arrLeft[i++];
			}
			else {
				arr[k++] = arrRight[j++];
			}
			
		}
		while (i < n1) {
			arr[k++] = arrLeft[i++];
		}
		while (j < n2) {
			arr[k++] = arrRight[j++];
		}
		
	}
}
