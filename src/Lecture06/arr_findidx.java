package Lecture06;

public class arr_findidx {
public static void main(String[] args) {
	int[] arr= {1,5,13,14,5};
	System.out.println(Find(arr,14));
			
}
public static int Find(int[] arr, int a) {
	for(int search=0; search<arr.length-1;search++) {
		if(arr[search] == a) {
			return search;
		}
		
	}
	return -1;
}
}
