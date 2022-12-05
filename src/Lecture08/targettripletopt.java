package Lecture08;

import java.util.Arrays;
import java.util.Scanner;

public class targettripletopt {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int target = scn.nextInt();
	Arrays.sort(arr);
	for(int i=0;i<arr.length-2;i++) {
		int nt= target-arr[i];
		int s=i+1;
		int e=arr.length-1;
		
		while(s<e) {
			if(arr[s]+arr[e]>nt) {
				e--;
			}
			else if(arr[s]+arr[e]<nt) {
				s++;
			}else {
				System.out.println(arr[i]+", "+arr[s]+" and "+arr[e]);
				e--;
				s++;
			}
			
		}
		
	}

	
}

}
