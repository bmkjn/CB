package Lecture05;

import java.util.Scanner;

public class pattern27 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count =0;
		for(int row=1;row<=n;row++) {
			int spc = n-1;
			int str = 1;
			int mid =1;
			while(spc>count) {
				System.out.print(" ");
				spc--;
			}
			while(str<2*row) {
				System.out.print(mid);
				str++;
				if(str>row) {
					mid--;
				}else {
					mid++;
				}
			}
			count++;
			System.out.println();
		}
		
	}
}
