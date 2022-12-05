package Lecture04;

import java.util.Scanner;

public class pattern13 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int count =n;
	for(int row=1;row<2*n;row++) {
		int inc = 0;
		int dec= n;
		if(row<=n) {
	while(inc<row) {
		System.out.print("*");
		inc++;
	}
		}else {
	while(dec>(row%5)) {
		System.out.print("*");
		dec--;
	}
		}
		System.out.println();
	}
}
}
