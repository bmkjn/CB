package Lecture02;

import java.util.Scanner;

public class isprime {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int div=1;
	int count=0;
	while(div<=n/2) {
		int rem= n%div;
		if(rem==0) {
			count++;
		}
		div++;
	}
	if(count>=2) {
		System.out.println("isnotprime");
	}
	else {
		System.out.println("isprime");
	}
	}
}
