package Lecture10;

public class extract {
public static void main(String[] args) {
	String str = "the sky is blue";
	int e=str.length();
	for(int i=str.length()-1;i>=0;i--) {
		if(str.charAt(i)==' ') {
			System.out.println(str.substring(i+1,e));
			e=i;
		}
		if(i==0) {
			System.out.println(str.substring(i,e));
		}
	}
}

}
