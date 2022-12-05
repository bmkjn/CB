package Lecture05;

import java.util.Scanner;

public class pascal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num1=n-1;
		for (int i=0 ; i<n;i++) {
		for(int spc=1;spc<=num1;spc++) {
			System.out.print(" ");
		}
		int val = 1; 
		for (int j=0; j<=i;j++) {
		System.out.print(val+" "); 
				val= val*(i-j)/(j+1);
		}
		num1--;
		System.out.println();
		}
		
	}
}
