package com.chenyufeng.lesson04;

//实现封装性
class Student{
	//给属性设置保护，使外界不能直接访问
	/*
	 * 实现该属性的set和get方法为外部访问
	 * */
	private String name;
	private int age;
	
	public void tell() {
		System.out.println("姓名："+getName() + "  "+"年龄："+getAge());
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}


public class Test02 {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setAge(18);
		student.setName("chenyufeng");
		student.tell();

		
	}

}
