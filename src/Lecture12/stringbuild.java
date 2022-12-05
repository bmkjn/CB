package Lecture12;

public class stringbuild {
public static void main(String[] args) {
	String str = "amul";
	System.out.println(str);
	StringBuilder sb = new StringBuilder(str);
	System.out.println(sb);
	sb.setCharAt(1, '*');
	System.out.println(sb);
	sb.append("okay");
	System.out.println(sb);
	
	sb.deleteCharAt(6);
	System.out.println(sb);
	
	String ans = sb.toString();

	System.out.println(ans);
	}
}
