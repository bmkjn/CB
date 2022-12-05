package Lecture09;

import java.util.Scanner;

public class maximumcircularsum {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t = scn.nextInt();
	for(int k=0;k<t;k++) {
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int cs=0;
	int ms=0;
	for(int i=0;i<size;i++) {
		
		if(arr[i]>= (-1*cs)) {
			cs = cs + arr[i];
		}else {
			cs = 0;
		}
		if(cs>ms) {
			ms=cs;
		}
	}
	System.out.println(ms);
	} 
	
}  
}
