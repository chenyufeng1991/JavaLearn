package com.chenyufeng.extenddemo;

class Father{
	
	//不添加任何的访问权限  默认
     void tell() {
		System.out.println("Father");
	}
}

class Son extends Father{
	//不能比父类方法更加严格的权限,否则编译不通过
	// private < default < public 
	 void tell(){
		super.tell();
		System.out.println("Son");
	}
}

public class Test03 {

	public static void main(String[] args) {
		
		Son son = new Son();
		son.tell();
		
	}
}
