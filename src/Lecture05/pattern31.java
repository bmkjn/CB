package Lecture05;

import java.util.Scanner;

public class pattern31 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row= 0;
		while(row<n) {
			int cst = 0;
			int count=n;
			
		 while(cst<n) {
			 if(row+cst==n-1) {
				 System.out.print("*");
			 }else {
			System.out.print(count);
			 }
			cst++;
			count--;
		}
		System.out.println();
		row++;
		   }
		 }
}
