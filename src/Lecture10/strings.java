package Lecture10;

public class strings {
public static void main(String[] args) {
	String str = "NITIN";
	allpalSubstrings(str);
}
public static void allSubstrings(String str) {
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			System.out.println(str.substring(i,j));
		}
	}
}
public static boolean ispalin(String str) {
	int s=0;
	int e=str.length()-1;
	while(s!=e) {
		if(str.charAt(s)!=str.charAt(e)) {
			return false;
		}
		s++;
		e--;
	}
	return true;
}
public static void allpalSubstrings(String str) {
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			String ss = str.substring(i,j);
			if(ispalin(ss)) {
			System.out.println(str.substring(i,j));
			}
		}
	}
}

}
