package Lecture10;

import java.util.Scanner;

public class rainwatertapping {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<=size; i++) {
		arr[i]=scn.nextInt();
	}

	int[] left =new int[arr.length];
	int max=0;
	for(int i=0;i<arr.length;i++) {
		left[i]=max;
		max = Math.max(max, arr[i]);
	}
	int[] right =new int[arr.length];
	 max=0;
	for(int i=arr.length-1;i>=0;i--) {
		right[i]=max;
		max = Math.max(max, arr[i]);
	}
	int sum=0;
	for(int mug=0;mug<arr.length;mug++) {
		int pani= Math.min(left[mug],right[mug])-arr[mug];
		sum = sum+Math.max(0, pani); //negative bhi aa skta ans
	}
	System.out.println(sum);
}
}
