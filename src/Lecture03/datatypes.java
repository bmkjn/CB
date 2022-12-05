package Lecture03;

import java.util.Scanner;

public class datatypes {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	long n = scn.nextLong();
	long i =1;
	long count = 0;
	if(n==0) {
		System.out.println(5);
	}
	else {
	while(n!=0) {
		long rem = n%10;
				if(rem==0) {
					rem=5;
				}
				count = count + rem*i;
				i = i*10;
				n = n/10;
	}
	System.out.println(count);
	}
}
}
