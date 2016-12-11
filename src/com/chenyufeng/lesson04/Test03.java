package com.chenyufeng.lesson04;

import com.sun.org.apache.bcel.internal.generic.NEW;

class Teacher{
	public void tell(){
		System.out.println("hello world");
	}
}

public class Test03 {
	
	public static void main(String[] args) {
		
		//正常访问
		Teacher teacher = new Teacher();
		teacher.tell();
		
		//使用匿名对象调用,只使用一次的时候可以这样调用。
		new Teacher().tell();
		
		
	}

}
