package Lecture03;

public class pattern02 {
public static void main(String[] args) {
	int n = 5;

	int row= 0;
	while(row<n) {
		int cst = 0;
	 while(cst<=row) {
		System.out.print("*");
		cst++;
	}
	System.out.println();
	row++;
	   }	
}
}
