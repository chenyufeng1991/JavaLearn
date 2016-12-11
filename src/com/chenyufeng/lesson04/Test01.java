package com.chenyufeng.lesson04;


class Person{
	String name;
	int age;
	public void tell(){
		System.out.println("姓名:" + name + "   " + "年龄：" + age);
	}
}

public class Test01 {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 19;
		person.name = "chenyufeng";
		 person.tell();
		
	}

}
