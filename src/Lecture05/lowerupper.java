package Lecture05;

import java.util.Scanner;

public class lowerupper {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	char ch = scn.next().charAt(0);
	if(ch>=65 && ch<=90) {
		System.out.println("upper");
	}else {
		System.out.println("lower");
	}
}
}
