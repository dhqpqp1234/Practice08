package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		int sum = 0;
		//코드를 작성하세요
		
		String[] nArray = numLine.split(" ");
		
		for(int i=0; i<nArray.length; i++) {
			
			int num = Integer.parseInt(nArray[i]);
			sum += num;
		}
		 
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
