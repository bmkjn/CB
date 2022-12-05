package Lecture06;

public class arr_max {
public static void main(String[] args) {
	int[] arr= {10,20,1,20,100,93};
	int ans = Max(arr);
	System.out.println(ans);
}
public static int Max(int[] arr) {
	int count=Integer.MIN_VALUE;
	for(int aam : arr) {
	if(aam>count) {
		count = aam;
	}
	}
	return count;
}
}
