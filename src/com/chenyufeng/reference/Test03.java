package com.chenyufeng.reference;

class People{
	
	String temp = "hello";
}

public class Test03 {
	
	public static void main(String[] args) {
		
		People people = new People();
		people.temp = "hello world"; //这里是被更改了，因为是重新创建了一个空间
		System.out.println(people.temp);
		
		tell(people);
		System.out.println(people.temp);
		
	}
	
	public static void tell(People peo){
		peo.temp = "hello Java";
	}

}
