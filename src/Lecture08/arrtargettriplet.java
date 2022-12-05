package Lecture08;

import java.util.Arrays;
import java.util.Scanner;

public class arrtargettriplet {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=scn.nextInt();
		}
		int target = scn.nextInt();
		triplet(arr, target);
		}
	
  public static void triplet(int[] arr, int target) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] ==target ) {
						System.out.println(arr[i] + " " + arr[j] + "and" + arr[k]);
					}
				}
			}
		}
	}
}
