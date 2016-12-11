package com.chenyufeng.reference;

 

public class Test02 {

	public static void main(String[] args) {
		
		//String中的数据是不可能被更改的；
		String str1 = "hello";
		System.out.println(str1);
		tell(str1);
		System.out.println(str1);
		
	}
	
	public static void tell(String str2) {
		str2 = "123456";
	}
}
