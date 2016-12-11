package com.chenyufeng.classdemo;

interface inter{
	public static final int AGE = 100;
	
	abstract public void tell();
	
}

interface inter2{
	abstract public void tell2();
}

abstract class abs1{
	public abstract void tell3();
}

class Mytest extends abs1 implements inter,inter2{

	@Override
	public void tell() {
		System.out.println("inter");
	}

	@Override
	public void tell2() {
		System.out.println("inter2");
	}

	@Override
	public void tell3() {
		
	}
	
}

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		Mytest mytest = new Mytest();
		mytest.tell();
		mytest.tell2();
		mytest.tell3();
		
		System.out.println(Mytest.AGE);
		
	}

}
