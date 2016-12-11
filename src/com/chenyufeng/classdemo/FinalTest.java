package com.chenyufeng.classdemo;

//class如果修饰为final，则不能被继承；
class Person{
	
	//方法如果修饰为final,则不能被重写；
     public void tell(){
		
	}
	
	
}


class Student extends Person{
	
	@Override
	public void tell() {

	}
	
	
}



public class FinalTest {
	
	public static void main(String[] args) {
		
		//声明为final的变量相当于常量，不能被修改
	   	String string = "chenyufeng";
		string = "12345";
		System.out.println(string);
		
	}

}
