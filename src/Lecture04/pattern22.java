package Lecture04;

import java.util.Scanner;

public class pattern22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numst=0;
		int numst2 = 0;
		for(int row=1;row<=n;row++) {
			int str=n;
			int spc =1;
			int str2=n-1;
			while(str>numst) {
				System.out.print("*");
				str--;
			}
			while(spc<2*numst) {
				System.out.print(" ");
				spc++;
			}
			while(str2>numst2) {
				System.out.print("*");
				str2--;
			}
			if(row>1) {
				numst2++;
			}
			numst++;
			System.out.println();
		}
	}
}
