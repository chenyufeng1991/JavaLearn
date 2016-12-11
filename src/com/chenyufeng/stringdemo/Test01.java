package com.chenyufeng.stringdemo;

public class Test01 {
	
	public static void main(String[] args) {
		
		String string1 = "hello";
		String string2 = new String("hello");
		//这里比较的是地址
		if (string1 == string2) {
			System.out.println("string1 == string2");
		}
		
		//这里比较的是内容
		if (string1.equals(string2)) {
			System.out.println("string1.equals(string2)");
			
		}
		
	}

}
