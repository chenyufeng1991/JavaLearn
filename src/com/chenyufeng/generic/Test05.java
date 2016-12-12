package com.chenyufeng.generic;

class Gener{
	
	//泛型方法
	//<T>:表示泛型标示，表示这是一个泛型方法；
	public <T>T tell(T t) {

		return t;
	}
}

public class Test05 {
	
	public static void main(String[] args) {
		Gener gener = new Gener();
		String string = gener.tell("Java love");
		System.out.println(string);
		
	}

}
