package Lecture09;

import java.util.Arrays;

public class selectionsort {
public static void main(String[] args) {
	int[] arr = {9,6,2,3,1,5,7,8,4};
	for(int i=0;i<arr.length-1;i++) {
		int min = arr[i];
		int cnt=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<min) {
				min = arr[j];
				cnt = j;
			}
		}
		swap(arr,i,cnt);
	}
	System.out.println(Arrays.toString(arr));
}
public static void swap(int[] a, int s, int t) {
	int temp = a[s];
	a[s]=a[t];
	a[t]=temp;
}
}
