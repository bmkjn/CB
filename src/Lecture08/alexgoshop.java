package Lecture08;

import java.util.Scanner;

public class alexgoshop {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	for(int j=0; j<n;j++) {
		arr[j]=scn.nextInt();
	}
	int t = scn.nextInt();
	for(int i=0;i<t;i++) {
		int count=0;
		int a = scn.nextInt();
		int k = scn.nextInt();
		for(int j=0;j<n;j++) {
			if(a%arr[j]==0) {
				count++;
			}
		}
		if(k>=count) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
}
}
