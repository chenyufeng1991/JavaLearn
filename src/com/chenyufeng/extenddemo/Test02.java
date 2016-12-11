package com.chenyufeng.extenddemo;

class A{
	public A() {
		System.out.println("A con");
	}
}

class B extends A{
	public B() {
//		super(); //可以不加super(), 因为在构造函数中，编译中会自动加上这个super(),所以会默认去调用父类的构造函数
		System.out.println("B con");
	}
}

public class Test02 {
	
	public static void main(String[] args) {
		
		//实例化子类对象，先调用父类的构造方法，再调用子类的构造方法
		B b = new B();
	}

}
