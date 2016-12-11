package com.chenyufeng.staticDemo;

class Person{
	private String name;
	
	//声明为static的属性是被整个类共有的
	private  static String city = "北京";
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//如果这个属性是static，那么它的getter、setter方法也是static的；
	public static String getCity() {
		return city;
	}
	public static void setCity(String city) {
		//使用类名进行调用
		Person.city = city;
	}
	
	public void tell() {
		System.out.println("姓名："+name + "  "+"城市："+city);
		
	}
}

public class Test01 {
	
	 int age;

	public static void main(String[] args) {
		
		Person.setCity("上海");
		Person person1 = new Person("张三");
		person1.tell();
		
		Person person2 = new Person("李四");
		person2.tell();
		
		//静态方法不能调用非静态方法
//		say();
	
		//静态方法也不能调用非静态属性
//		age = 10;
	}
	
	public void say() {
		System.out.println("say");
		
	}
}
