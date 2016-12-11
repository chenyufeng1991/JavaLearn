package com.chenyufeng.lesson05;

class Person{
	
	String name;
	int age;
	
	//构造方法也可以传递参数，为属性初始化
	public Person(String n){
		name = n;
		System.out.println("姓名："+name +  "  "+"年龄："+ age);
	}
	
	//构造方法也可以重载
	public Person(String n, int a){
		name = n;
		age = a;
		System.out.println("姓名："+name +  "  "+"年龄："+ age);
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		Person person1 = new Person("chenyufeng");
		Person person2 = new Person("gaowenjing", 20);
		
		
	}
}
