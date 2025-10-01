package com.test.queue;

public class linearSearch {
	  public static void main(String[] args) {
		  int [] arr= {10,80,70,40,30};
		  int target=70;
		  int result= LinearSearchElement(arr,target);
		  System.out.println(result);
	  }

	private static int LinearSearchElement(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
