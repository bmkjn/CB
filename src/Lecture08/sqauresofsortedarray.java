package Lecture08;

import java.util.Arrays;
import java.util.Scanner;

public class sqauresofsortedarray {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int res[] = new int[arr.length];
	int s=0;
	int e=arr.length-1;
	int k=arr.length-1;
	while(e>=s) {
		
		int i = arr[s]*arr[s];
		int j = arr[e]*arr[e];
		if(i>j) {
			res[k]=i;
			s++;
		}
		else {
			res[k]=j;
			e--;
		}
          k--;
	}
	System.out.print(Arrays.toString(res));
}
}
