package Lecture05;

import java.util.Scanner;

public class fibbopattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

	int row= 0;
	int a = 0;
	int b = 1;
	int c;
	while(row<n) {
		int cst = 0;
	 while(cst<=row) {
		System.out.print(a+"\t");
		cst++;
		 c=a+b;
		 a=b;
		 b=c;
	}
	System.out.println();
	row++;
	   }	
}
}
