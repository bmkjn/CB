package Lecture09;

import java.util.Arrays;

public class insertionsort {
public static void main(String[] args) {
	int[] arr = {9,6,2,3,1,5,7,8,4};
	for(int i=1; i<arr.length;i++) {
		int j=i-1;
		while(j>=0) {
			if(compare(arr[j],arr[j+1])) {
			swap(arr, j, j+1);
			}
			else {
				break; 
			}
		j--;
		}
	
	}
	System.out.println(Arrays.toString(arr));
}
	

public static void swap(int[] a, int s, int t) {
	int temp = a[s];
	a[s]=a[t];
	a[t]=temp;
}
public static boolean compare(int c, int d){
	if(c>d) {
		return true;
	}else {
		return false;
	}

}
}
