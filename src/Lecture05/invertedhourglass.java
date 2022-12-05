package Lecture05;

import java.util.Scanner;

public class invertedhourglass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num1=n;
		int num2=n;
		int num3=n;
		for(int row=0;row<=2*n;row++) {
			for(int i=n;i>=num3;i--) {
				System.out.print(i+" ");
			}
			for(int i=1;i<2*num2;i++) {
				System.out.print("  ");
			}
			for(int i=num1;i<=n;i++) {
				System.out.print(i+" ");
			}
			if(row<n) {
				if(row<n-1) {
				num1--;
				}
				num2--;
				num3--;
			}else {
				if(row>n) {
				num1++;
				}
				num2++;
				num3++;
			}
			System.out.println();
		}
	}
}
