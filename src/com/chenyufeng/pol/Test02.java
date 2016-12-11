package com.chenyufeng.pol;

class A1{
	public void tell1() {
		System.out.println("A1----tell");
	}
}

class B1 extends A1{
	public void tell2() {
		System.out.println("B1---tell");
	}
}

class C1 extends A1{
	public void tell3() {
		System.out.println("C1----tell");
	}
}

public class Test02 {
	
	public static void main(String[] args) {
		
	say(new B1());
	say(new C1());
	}
	
	public static void say(A1 a) {
		a.tell1();
	}
}
