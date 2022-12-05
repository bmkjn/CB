package Lecture06;

import java.util.Arrays;
import java.util.Scanner;

public class arr_reverse {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
	}
	Reverse(arr);
	Display(arr);
	
}

public static void Reverse(int[] arr) {
	int i = 0;
	int j = arr.length-1;
	while(i<j) {
		int a = arr[i];
		arr[i]=arr[j];
		arr[j]=a;
		i++;
		j--; 
	}
	
}
public static void Display(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}

}

