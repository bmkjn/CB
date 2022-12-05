package Lecture02;

import java.util.Scanner;

public class lcm {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt(); //divisor
		int n = scn.nextInt(); //dividend
		int a=m;
		int b=n;
     while(m!=0) {
	int rem = n%m;
			n = m;
			m = rem;		
}
     System.out.println(a*b/n);
	}
}
