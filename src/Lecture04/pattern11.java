package Lecture04;

import java.util.Scanner;

public class pattern11 {
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
				if(str%2==0) {
				System.out.print(" ");
				}else {
			    System.out.print("*");	
				}
				str++;
			}
			count++;
			System.out.println();
		}
		
	}

}
