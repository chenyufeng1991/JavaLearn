package com.chenyufeng.instanceofdemo;

class A{
	
}

class B extends A{
	
}

public class Test01 {
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
		//向上转型
		A a2 = new B();
		System.out.println(a2 instanceof A);
		System.out.println(a2 instanceof B);
		
		
	}

}
