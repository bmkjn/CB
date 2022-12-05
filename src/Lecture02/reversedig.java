package Lecture02;

import java.util.Scanner;

public class reversedig {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int count = 0;
	while(n>0) {
		int rem = n%10;
		count = count*10+rem;
		n =n/10;
	}
	System.out.println(count);
	}
}
