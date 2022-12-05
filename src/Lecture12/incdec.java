package Lecture12;

public class incdec {
	public static void main(String[] args) {
		PD(1,4);
	}
	public static void PD(int n, int m) {
		if(n==m+1) {
			return;
		}
		System.out.println(n);
		PD(n+1,m);
		System.out.println(n);
	}
}
