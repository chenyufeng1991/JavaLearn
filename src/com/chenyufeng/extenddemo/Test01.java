package com.chenyufeng.extenddemo;

class Person{
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

class Worker extends Person{
	
	//子类不能访问到父类的private变量
	public void tell() {
		System.out.println(getAge());
		
	}
}

public class Test01 {
	
	public static void main(String[] args) {
		
		Worker worker = new Worker();
		worker.setAge(18);
		worker.tell();
		
	}

}
