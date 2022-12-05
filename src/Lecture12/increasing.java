package Lecture12;

public class increasing {
	public static void main(String[] args) {
		PD(4);
	}
	public static void PD(int n) {
		if(n==0) {
			return;
		}
		
		PD(n-1);
		System.out.println(n);
	}
}
