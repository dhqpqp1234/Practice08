package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int input1 = sc.nextInt();
    String input3 = sc.next();
    int input2 = sc.nextInt();
    
    
    
    if(input3.equals("+")) {
    	Add a = new Add();
    	a.setValue(input1, input2);
    	System.out.println(a.calculate());
    }else if(input3.equals("-")) {
    	Sub s = new Sub();
    	s.setValue(input1, input2);
    	System.out.println(s.calculate());
    }else if(input3.equals("*")) {
    	Mul m = new Mul();
    	m.setValue(input1, input2);
    	System.out.println(m.calculate());
    }else if(input3.equals("/")) {
    	Div d = new Div();
    	d.setValue(input1, input2);
    	System.out.println(d.calculate());
    }else if(input3.equals("%")) {
    	System.out.println("알 수 없는 연산입니다.");
    }else if(input3.equals("/q")) {
    	System.out.println("종료합니다.");
    }
    
    
    sc.close();
    	
    }
}
