package Lecture07;

public class maxsubarrsum {
	public static void main(String[] args) {
		int[] arr= {4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-5,-9,6,1};
		int count=Integer.MIN_VALUE;
		int sum =0; 
		for(int row=0;row<arr.length;row++) {
				if(sum<0) {
					sum = arr[row];
			}else {
				sum = sum+arr[row];
			}
				if(sum>count) {
					count = sum;
				}
			
		}
		    System.out.println(count);
	}
}
