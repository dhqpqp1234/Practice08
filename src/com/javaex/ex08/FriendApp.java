package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
	
	
		
	Scanner sc = new Scanner(System.in);
	
	Friend[] fArray = new Friend[3];
	System.out.println("친구를 3명 등록해 주세요.");
	for(int i=0; i<fArray.length; i++) {
		String name = sc.next();
		String hp = sc.next();
		String school = sc.next();
		fArray[i] = new Friend (name, hp, school);
	}
	
	for (int i=0; i<fArray.length; i++) {
		fArray[i].showinfo();
	}
	
	
	sc.close();
	
		
	}

}
