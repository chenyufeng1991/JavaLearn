package com.chenyufeng.reference;

class Person{
	int age = 10;
	
}

public class Test01 {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 30;
		System.out.println(person.age);
		tell(person);
		System.out.println(person.age);
		
	}
	
	public static void tell(Person per){
		per.age = 50;
	}

}
