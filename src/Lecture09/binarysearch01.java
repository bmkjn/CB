package Lecture09;

import java.util.Scanner;

public class binarysearch01 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int ali = scn.nextInt();
	int ans = indexof(arr,ali);
	System.out.println(ans);
}
public static int indexof (int[] arr, int ali) {
	int s= 0;
	int e= arr.length-1;
  while(s<=e) {
	  int mid =(s+e)/2;
	  if(ali==arr[mid]) {
		  return (mid);
	  }else if(ali<arr[mid]) {
		  e=mid-1;  
	  }else {
		  s=mid+1;
	  }
  }
	  return -1;
  }
}

