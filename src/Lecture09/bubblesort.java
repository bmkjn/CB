package Lecture09;

import java.util.Arrays;

public class bubblesort {
public static void main(String[] args) {
	int[] arr = {9,6,2,3,1,5,7,8,4};
	int n = arr.length;
	while(n>0) {
		for(int i=0;i<n-1;i++) {
			if(compare(arr[i],arr[i+1])) {
				swap(arr, i,i+1);
			}
		}
		n--;
	}
	System.out.println(Arrays.toString(arr));
}
public static void swap(int[] a, int s, int t) {
	int temp = a[s];
	a[s]=a[t];
	a[t]=temp;
}
public static boolean compare(int c, int d){
	if(d<c) {
		return true;
	}else {
		return false;
	}

}
}