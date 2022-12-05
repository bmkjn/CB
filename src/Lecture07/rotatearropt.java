package Lecture07;

import java.util.Arrays;
import java.util.Scanner;

public class rotatearropt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=scn.nextInt();
		}
		int x = scn.nextInt();
		x=x%arr.length;
		//for negative x
		if(x<0) {
			x=x+arr.length;
		}
		reverse(arr,0,arr.length-x-1);
		reverse(arr,arr.length-x,arr.length-1);
		reverse(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
		
	}
	public static void reverse(int[] arr, int s, int e) {
		int i=s;
		int j=e;
		while(i<j) {
			int a = arr[i];
			arr[i]=arr[j];
			arr[j]=a;
			i++;
			j--; 
		}
		
	}
}
