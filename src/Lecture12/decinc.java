package Lecture12;

public class decinc {
	public static void main(String[] args) {
		PD(4);
	}
	public static void PD(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
		System.out.println(n);
	}
}
