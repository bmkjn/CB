package Lecture03;

public class Pattern06 {
public static void main(String[] args) {
		int n = 5;
		int count =n;
		int row = 1;
		while(row<=n) {
			int cst=1;
			while(cst<row) {
				System.out.print(" ");
				System.out.print(" ");
				cst++;
			}
			int rst = 1;
			while(rst<=count) {
				System.out.print("*");
				rst++;
			}
			System.out.println();
			row++;
			count--;
		}
	
	   
}
}
