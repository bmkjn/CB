package Lecture12;

public class power {
	public static void main(String[] args) {
		System.out.println(PD(2,8));
	}
	public static int PD(int x, int n) {
		if(n==1) {
			return x;
		}
		
		int ans = x*PD(x,n-1);
	    return ans;
	}
}
