package Lecture07;

public class subarr {
public static void main(String[] args) {
	int[] arr= {10,20,30,40};
	for(int row=0;row<arr.length;row++) {
		int sum =0; 
		for(int col=row;col<arr.length;col++) {
			
			for(int i=row;i<=col;i++) {
				System.out.print(arr[i]);
				
			}
			sum = sum+arr[col];
			System.out.println();
			System.out.println(sum);
			System.out.println();
		}
		System.out.println();
	}
	
}
}
