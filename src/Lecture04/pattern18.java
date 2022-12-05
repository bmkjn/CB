package Lecture04;

import java.util.Scanner;

public class pattern18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numst=n/2;
		int numst2 = 1;
		for(int row=1;row<=n;row++) {
			int str1=0;
			int spc=1;
			int str2=n/2;
			while(str1<numst) {
				System.out.print(" ");
				str1++;
			}
			while(spc<numst2*2) {
				System.out.print("*");
				spc++;
			}
			while(str2>=numst2) {
				System.out.print(" ");
				str2--;
			}
			if(row<=(n/2)) {
				numst--;
				numst2++;
			}else {
				numst++;
				numst2--;
			}
			System.out.println();
		}
	}
}
