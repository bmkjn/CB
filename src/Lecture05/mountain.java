package Lecture05;

import java.util.Scanner;

public class mountain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num1=1;
		int num2=n-1;
		int num3=1;
		for(int row=0;row<n;row++) {
			for(int i=1;i<=num1;i++) {
				System.out.print(i+"\t");
			}
			for(int i=1;i<2*num2;i++) {
				System.out.print(" \t");
			}
			for(int i=num3;i>=1;i--) {
				System.out.print(i+"\t");
			}
			if(row<n-2) {
				num3++;
			}
			num1++;
			num2--;
			System.out.println();
		}
	}
}
