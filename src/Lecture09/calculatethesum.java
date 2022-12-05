package Lecture09;

import java.util.Scanner;

public class calculatethesum {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int t = scn.nextInt();
	int c=0;
	int[] mac = new int[size];
	long sum=0;
	for(int i=0;i<t;i++) {
		 c = scn.nextInt();
			for(int j=0; j<size; j++) {
				mac[j] = arr[j]+arr[(j-c+size)%size];
				sum = sum+mac[j];
			}
			for(int k=0; k<size; k++) {
				arr[k]=mac[k];
			}
		}
	for(int i=0; i<size; i++) {
		sum = sum+arr[i];
	}
	
	 long ans = sum % 1000000007;
	System.out.println(ans);
	
}
}
