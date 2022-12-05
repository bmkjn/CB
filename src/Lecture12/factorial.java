package Lecture12;

public class factorial {
	public static void main(String[] args) {
		System.out.println(PD(4));
	}
	public static int PD(int n) {
		if(n==1) {
			return 1;
		}
		
		int ans = n*PD(n-1);
	    return ans;
	}
}
