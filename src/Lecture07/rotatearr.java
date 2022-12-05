package Lecture07;

import java.util.Arrays;
import java.util.Scanner;

public class rotatearr {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int x = scn.nextInt();
	//for negative x
	if(x<0) {
		x=x+arr.length;
	}else {
	x=x%arr.length;
	}
	for(int j=0;j<x;j++) {
	int store = arr[arr.length-1]; 
	for(int i=arr.length-2; i>=0; i--) {
		arr[i+1]=arr[i];
	}
	arr[0]=store;
	}
	System.out.print(Arrays.toString(arr));
}
}
