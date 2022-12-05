package Lecture06;

import java.util.Scanner;

public class findali {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=scn.nextInt();
		}
		int ali = scn.nextInt();
		System.out.println(Find(arr,ali));
				
	}
	public static int Find(int[] arr, int a) {
		int count=0;
		for(int search=0; search<arr.length;search++) {
			if(arr[search] == a) {
				count++;
			}
			
		}
		return count;
	}
}
