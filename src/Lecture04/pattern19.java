package Lecture04;

import java.util.Scanner;

public class pattern19 {
	
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int numst1=n;
			int numst2=n-1;
			int numst3=0;
			for(int row=1;row<2*n;row++) {
				
				for(int str=1;str<=numst1;str++) {
					System.out.print("*");
				}
				for(int spc=1;spc<2*numst3;spc++) {
					System.out.print(" ");
				}
				for(int str=1;str<=numst2;str++) {
					System.out.print("*");
				}
				if(row<n) {
					numst1--;
					numst3++;
					if(row>1) {
						numst2--;
					}
				}else {
					numst1++;
					numst3--;
					if(row<(2*n)-2) {
						numst2++;
					}
				}
				System.out.println();
			}
		}
			
}
	
