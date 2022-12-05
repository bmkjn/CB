package Lecture04;

import java.util.Scanner;

public class pattern10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count =0;
		int count2=n;
		for(int row=1;row<=n;row++) {
			int spc = 0;
			int str = 1;
			while(spc<count) {
				System.out.print(" ");
				spc++;
			}
			while(str<2*count2) {
				System.out.print("*");
				str++;
			}
			count++;
			count2--;
			System.out.println();
		}
		
	}
}
