package Lecture05;

import java.util.Scanner;

public class hourglass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num1=n;
		int num2=0;
		for(int row=0;row<=2*n;row++) {
			for(int spc=1;spc<=num2;spc++) {
				System.out.print("  ");
			}
			int mid = num1;
			for(int i=0;i<=2*num1;i++) {
				System.out.print(mid+" ");
				if(i<num1) {
					mid--;
				}else {
					mid++;
				}
			}
			if(row<n) {
				num1--;
				num2++;
			}else {
				num1++;
				num2--;
			}
			System.out.println();
			
		}
		
		}
}
