package com.chenyufeng.classdemo;

abstract class Person2{
	private int age;
	
	public void tell(){
		
	}
	
	public abstract void say();
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}

class Teacher extends Person2{

	//必须要重写抽象类中的抽象方法
	@Override
	public void say() {
		
	}
	
	//子类不能直接使用父类的private变量，只能通过继承setter、getter方法
	
}

public class AbstractClassTest {
	
	public static void main(String[] args) {
		
		//错误，不能实例化一个抽象类
//		Person2 person2 = new Persos2();
		
		Teacher teacher = new Teacher();
		teacher.setAge(28);
		System.out.println(teacher.getAge());
		
	}

}
