package com.test.queue;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {10,30,35,40,50,80};
		int target= 50;
		int result= binarySearch(arr,target);
		System.out.println("Index of number 50 is: "+ result);
	}
	public static int binarySearch(int arr[], int target) {
		int low=0;
		int high= arr.length-1;
		while(low<=high) {
			int mid=low+ (high-low)/2;
			if(arr[mid]==target) {
				return mid;
			} else if(arr[mid]<target) {
				low= mid+1;
			} else {
				high=mid-1;
			}
			
		}
		return -1;
	}
}

