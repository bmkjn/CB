package Lecture05;

import java.util.Scanner;

public class pattern24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int count =0;
		for(int row=1;row<=n;row++) {
			int spc = n-1;
			int str = 1;
			while(spc>count) {
				System.out.print(" ");
				spc--;
			}
			while(str<2*row) {
				System.out.print(row);
				str++;
				
			}
			count++;
			System.out.println();
		}
		
	}
}
