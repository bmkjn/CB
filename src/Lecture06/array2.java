package Lecture06;

import java.util.Scanner;

public class array2 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	for(int e : arr) {
		System.out.print(e+" ");
	}
}
}
