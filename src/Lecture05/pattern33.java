package Lecture05;

import java.util.Scanner;

public class pattern33 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count =0;
		int count2=n;
		for(int row=1;row<=n;row++) {
			int spc = n-1;
			int str = 1;
			int num1=n-1;
			int num2=count2;
			while(spc>count) {
				System.out.print(" ");
				spc--;
			}
			while(str<2*row) {
				if(str==row) {
					System.out.print(0);
				}else if(str<row) {
				System.out.print(num2);
				num2++;
			     }else {
			    	 System.out.print(num1);
			    	 num1--;
			     }
				str++;
			}
			count++;
			count2--;
			System.out.println();
		}
		
	}

}
