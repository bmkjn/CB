package Lecture04;

import java.util.Scanner;

public class pattern07 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=n;col++) {
			if(row==1 || row==n || col==1 || col==n) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
