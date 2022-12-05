package Lecture08;

import java.util.*;
import java.util.Scanner;

public class intersectionofarr {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int size = scn.nextInt();
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i]=scn.nextInt();
	}
	int mac[]= new int[size];
	for(int i=0; i<size; i++) {
		mac[i]=scn.nextInt();
	}
	
	Arrays.sort(arr);
	Arrays.sort(mac);
	int acount=0;
	int mcount=0;
	ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	while(acount<size && mcount<size) {
		if(arr[acount]<mac[mcount]) {
			acount++;
		}
		else if(mac[mcount]<arr[acount]) {
			mcount++;
		}else {
			 myNumbers.add(arr[acount]);
			 acount++;
			 mcount++;
		}
	}
	
	System.out.println(myNumbers);
	
}
}
