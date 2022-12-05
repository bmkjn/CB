package Lecture05;

import java.util.Scanner;

public class rhombus0 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count =0;
		int count2=1;
		for(int row=1;row<2*n;row++) {
			int spc = n-1;
			int str = 1;
			int mid =count2;
			while(spc>count) {
				System.out.print("  ");
				spc--;
			}
			while(str<2*count2) {
				System.out.print(mid+" ");
				str++;
				if(str>count2) {
					mid--;
				}else {
					mid++;
				}
			}
			if(row<n) {
			count++;
			count2++;
			}else {
				count--;
				count2--;
			}
			System.out.println();
		}
		
	}
}
