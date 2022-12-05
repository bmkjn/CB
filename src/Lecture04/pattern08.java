package Lecture04;

import java.util.Scanner;

public class pattern08 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();

	int row= 0;
	while(row<n) {
		int cst = 0;
	 while(cst<n) {
		 if(row==cst || row+cst==n-1) {
		System.out.print("*");
		 }else {
			 System.out.print(" ");
		 }
		cst++;
	}
	System.out.println();
	row++;
	   }
}
}
