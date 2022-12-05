package Lecture04;

import java.util.Scanner;

public class pattern15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numst = 1;
		for(int row=1;row<2*n;row++) {
			int spc =1;
			int str=n;
			while(spc<numst) {
			System.out.print(" "+" ");
			spc++;
			}
			while(str>=numst) {
				System.out.print("*");
				str--;
			}
			if(row<5) {
				numst++;
			}else {
				numst--;
			}
			System.out.println();
		}
	}
}
