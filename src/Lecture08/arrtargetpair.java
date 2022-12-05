package Lecture08;

import java.util.Scanner;

public class arrtargetpair {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=scn.nextInt();
		}
	int t= scn.nextInt();
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(i==j && j<arr.length-1) {
				j++;
			}
		if(arr[i]+arr[j]==t) {
			int count1=0;
			int count2=0;
		   if(arr[i]<arr[j]) {
			   count1 = arr[i];
			   count2= arr[j];
		   }else {
			   count1=arr[j];
			   count2=arr[i];
		   }
			System.out.println(count1+" and "+count2);
			arr[i]=Integer.MIN_VALUE;
			arr[j]=Integer.MIN_VALUE;
		    }
		}
		
		
	}
	
	}
}
