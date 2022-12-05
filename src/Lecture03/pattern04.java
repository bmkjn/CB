package Lecture03;

public class pattern04 {
public static void main(String[] args) {
	int n = 0;
	int row= 5;
	int count= 0;
	while(row>n) {
		int cst = 0;
	 while(cst<row-1) {
		System.out.print(" ");
		cst++;
	} 
	 int rst=0;
	 while(rst<=count) {
		System.out.print("*");
		rst++;
	}
	
	System.out.println();
	count++;
	row--;
	
	   }	
}
}
