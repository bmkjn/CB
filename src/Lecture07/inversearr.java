package Lecture07;

import java.util.Arrays;
import java.util.Scanner;

public class inversearr {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	Inverse(arr);
			
}
public static void Inverse(int[] arr) {
	int[] in = new int[arr.length];
	for(int i=arr.length-1; i>=0;i--) {
		in[arr[i]]=i;
	}
	System.out.print(Arrays.toString(in));
}
}