package Lecture12;

public class stringimmutability {
public static void main(String[] args) {
		String str1 = "Hello"; //Literal
		String str2 = "Hello";
		
		System.out.println(str1==str2);
		
		String str3= new String("Hello"); //new
		String str4= new String("Hello"); 
		
		System.out.println(str3==str4);
}
}
