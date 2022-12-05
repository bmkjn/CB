package Lecture08;

import java.util.Scanner;

public class majorityelement {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int cnt =0;
	int ele =0;
	for(int i=0; i<arr.length;i++) {
		if(cnt==0) {
			ele = arr[i];
		}
		if(arr[i]==ele) {
			cnt++;
		}else {
			cnt--;
		}
	}
	System.out.println(ele);
}
}
