package com.chenyufeng.thisdemo;


class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this(); //直接调用默认的构造方法
		
		//this访问属性
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		System.out.println("默认构造函数");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void tell() {
		System.out.println("姓名："+this.getName()+"   "+"年龄："+this.getAge());
	}
	
	//this表示当前对象
	public void tellThis(){
		System.out.println(this);
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		Person person = new Person("chenyufeng", 24);
		person.tell();
		
		System.out.println(person);
		person.tellThis();
		
	}
}
