package Lecture01;

import java.util.Scanner;

public class summation {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int i = 1;
	int count = 0;
	while(i<=n) {
		count = i + count;
		i++;
	}
	System.out.println(count);
}
}
