package Lecture12;

public class fibborecursion {
	public static void main(String[] args) {
		System.out.println(PD(8));
	}
	public static int PD(int n) {
//		if(n==1) {
//			return 1;
//		}
//		if(n==0) {
//			return 0;
//		}
		if(n<=1) {
			return n;
		}
		
		int val1 = PD(n-1);
		int val2 = PD(n-2);
	    return val1+val2;
	}
}
