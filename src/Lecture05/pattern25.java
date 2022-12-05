package Lecture05;

import java.util.Scanner;

public class pattern25 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1;
		int count =0;
		for(int row=1;row<=n;row++) {
			int spc = n-1;
			int str = 1;
			while(spc>count) {
				System.out.print(" \t");
				spc--;
			}
			while(str<2*row) {
				System.out.print(i+"\t");
				str++;
				i++;
			}
			count++;
			System.out.println();
		}
		
	}
}
