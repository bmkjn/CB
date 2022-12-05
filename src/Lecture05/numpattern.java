package Lecture05;

public class numpattern {
public static void main(String[] args) {
	int n =5;
	int nsp = n-1;
	int nst = 1;
	int row=1;
	int ntp = 1;
	while(row<=n) {
		int csp = 0;
		while(csp<nsp) {
			System.out.print("\t");
			csp++;
		}
		int cst = 0;
		while(cst<nst) {
			System.out.print(ntp + "\t");
			cst++;
			ntp++;
		}
		nst = nst+2;
		nsp--;
		row++;
		System.out.println();
		
	}
}
}
