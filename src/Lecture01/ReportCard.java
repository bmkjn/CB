package Lecture01;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int marks = scn.nextInt();
		
		if (marks >= 90) {
			System.out.println("A");
			
		} else if (marks >= 80) {
			System.out.println("B");

		} else if (marks >= 70) {
			System.out.println("C");

		} else if (marks >= 60) {
			System.out.println("D");

		} else if (marks >= 50) {
			System.out.println("E");

		} else {
			System.out.println("fail");
		}


	}
}
