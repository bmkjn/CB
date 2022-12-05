package Lecture04;

import java.util.Scanner;

public class pattern21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numst=2*n-3;
		int numst2 = 1;
		for(int row=1;row<=n;row++) {
			int str=0;
			int spc =0;
			int str2=0;
			while(str<row) {
				System.out.print("*");
				str++;
			}
			while(spc<numst) {
				System.out.print(" ");
				spc++;
			}
			while(str2<numst2) {
				System.out.print("*");
				str2++;
			}
			if(row<n-1) {
				numst2++;
			}
			numst-=2;
			System.out.println();
		}
	}
}
