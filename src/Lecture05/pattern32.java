package Lecture05;

import java.util.Scanner;

public class pattern32 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numst = 1;
		for(int row=1;row<2*n;row++) {
			int str=1;
		while(str<2*numst) {
			if(str%2==0 ) {
				System.out.print("*");
			}else {
			System.out.print(numst);
			}
			str++;
		}
			if(row<n) {
				numst++;
			}else {
				numst--;
			}
			System.out.println();
		}
	}
}
