package Lecture01;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int rem = num % 2;
		System.out.println(rem);
		if (rem == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
