package Lecture08;

import java.util.Arrays;
import java.util.Scanner;

public class pairofroses {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int i=0;i<t;i++) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			for(int j=0; j<n;j++) {
				arr[j]=scn.nextInt();
			}
			int a = scn.nextInt();
			int count=Integer.MAX_VALUE;
			int k=0;
			Arrays.sort(arr);
			int s=0;
			while(s<n-1) {
				int e=s+1;
			  while(e<n) {
				if(arr[s]+arr[e]<a) {
					e++;
				}
			else if(arr[s]+arr[e]==a) {
				if(arr[e]-arr[s]<count) {
					count=arr[e]-arr[s];
					k=arr[s];
				}
					s++;
					break;
				}
			else {
				s++;
				break;
			}
				
			}
				
		}
			System.out.println("Deepak should buy roses whose prices are "+ (k) +" and "+ (k+count) +".");	
		}
	}

}
