package Lecture08;

import java.util.Scanner;

public class productofarrayexceptself {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=scn.nextInt();
		}
		
		if(arr.length==2) {
			System.out.print(arr[1]+" "+arr[0]);
		}else {
		
		for(int i=0;i<arr.length;i++) {
			long product=1;
			for(int j=0;j<arr.length;j++) {
				if(i==j && j<arr.length-1) {
					j++;
				}
				
				product = (long)(product*arr[j]);
				if(i==arr.length-1 && j==i-1) {
					break;
				}
			}
			System.out.print(product+" ");
		}
		}
		
	}
}
