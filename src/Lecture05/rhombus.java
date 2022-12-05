package Lecture05;

import java.util.Scanner;

public class rhombus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numst=n-1;
		for(int row=0;row<n;row++) {
			for(int spc=0;spc<numst;spc++) {
				System.out.print(" ");
			}
			for(int col=0;col<n;col++) {
				if(row==0 || row==n-1 || col==0 || col==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			numst--;
			System.out.println();
		}
	}
}
