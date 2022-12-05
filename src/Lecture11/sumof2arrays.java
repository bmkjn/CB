package Lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class sumof2arrays {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int size2 = scn.nextInt();
	int mac[]= new int[size2];
	for(int i=0; i<size2; i++) {
		mac[i]=scn.nextInt();
	}
	ArrayList<Integer> al = new ArrayList<>();
	int i = arr.length-1;
	int j= mac.length-1;
	int c=0;
	while(i>=0 || j>=0) {
		int k=c;
		if(i>=0) {
		 k = k+arr[i];
		}
		if(j>=0) {
		k = k+mac[j];
		}
			int ans = k%10;
			c=k/10;
			al.add(0,ans);
			i--;
			j--;

		}
				
	if(c!=0) {
		al.add(0,c);
	}
}
}
