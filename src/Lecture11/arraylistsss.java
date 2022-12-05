package Lecture11;

import java.util.ArrayList;

public class arraylistsss {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(90);
	al.add(80);
	al.add(70);
	al.add(60);
	for(int i: al) {
		System.out.println(i);
	}
	System.out.println("***********");
	for(int i=0; i<al.size();i++) {
		System.out.println(al.get(i));
	}
}
}
