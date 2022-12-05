package Lecture06;

public class armstrongnum {
	public static void main(String[] args) {
		int N = 371;
		boolean b = isArm(N);
		System.out.println(b);
	}
	public static boolean isArm(int num) {
		int nod = numofDig(num);
		int sum = 0;
		int backup = num;
		while(num!=0) {
			int digit = num%10;
			sum = sum+ (int)Math.pow(digit, nod);
			num = num/10;
		}
		if(sum==backup) {
			return true;
		} else {
			return false;
		}
	}
	public static int numofDig(int num) {
			int ans = 0;
		   while(num!=0) {
		   num = num/10;
		   ans++;
		}
		return ans;
		}

}
