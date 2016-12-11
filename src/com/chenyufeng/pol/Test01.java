package com.chenyufeng.pol;

class A{
	
	public void tell01() {
		System.out.println("A----tell01");
		
	}
	
	public void tell02(){
		System.out.println("A----tell02");
	}
}

class B extends A{
	@Override
	public void tell01() {
		System.out.println("B----tell01");
	}
	
	public void tell03() {
		System.out.println("B----tell03");
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		//向上转型
//		A a = new B();
//		a.tell01();
//		a.tell02();
		
		
		//向下转型:首先要进行向上转型
		A a = new B();
		B b = (B)a;
		b.tell01();
		b.tell02();
		b.tell03();
		
	}

}
