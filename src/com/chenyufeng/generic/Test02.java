package com.chenyufeng.generic;

class A<T>{
	
	private T value;
	
	//构造方法中使用泛型
	public A(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}

public class Test02 {
	
	public static void main(String[] args) {
		A<String> a = new A<String>("字符串");
		System.out.println(a.getValue());
		
	}

}
