package Lecture08;

import java.util.Scanner;

public class firstmissingpositive {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	
	for(int i=0;i<arr.length;i++)  {
		if(arr[i]>0 && arr[i]<arr.length+1) {
		if(arr[i]!=i+1 && arr[i]!=arr[arr[i]-1]) {
			int temp = arr[arr[i]-1];
			arr[arr[i]-1] = arr[i];
			arr[i] = temp;
			i--;
		}
		}
	}
	int count=0;
	for(int i=0; i<size; i++) {
		if(i+1!=arr[i]) {
			System.out.println(i+1);
			break;
		}else {
			count++;
		}
	}
	if(count==size) {
		System.out.println(size+1);
	}
	
}
}
