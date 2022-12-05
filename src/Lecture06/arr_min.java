package Lecture06;

public class arr_min {
	public static void main(String[] args) {
		int[] arr= {10,20,1,20,100,93};
		int ans = Min(arr);
		System.out.println(ans);
	}
	public static int Min(int[] arr) {
		int count=Integer.MAX_VALUE;
		for(int aam : arr) {
		if(aam<count) {
			count = aam;
		}
		}
		return count;
	}
}
