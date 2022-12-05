package Lecture08;

import java.util.Arrays;
import java.util.Scanner;

public class pairofrosesopt {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t = scn.nextInt();
	for(int i=0;i<t;i++) {
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int j=0; j<n;j++) {
			arr[j]=scn.nextInt();
		}
		int a = scn.nextInt();
		Arrays.sort(arr);
		int s=0;
		int e=arr.length-1;
		int r1=0;
		int r2=0;
		while(s<e) {
			if(arr[s]+arr[e]>a) {
				e--;
			}
			else if(arr[s]+arr[e]<a) {
				s++;
			}else {
				r1=arr[s];
				r2=arr[e];
				e--;
				s++;
			}
		}
		
		System.out.println("Deepak should buy roses whose prices are "+ r1 +" and "+ r2 +".");	

		
	}
}
}
