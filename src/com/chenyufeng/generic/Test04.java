package com.chenyufeng.generic;

//泛型接口
interface GenInter<T>{
	public void tell();
}

class GenClass<T> implements GenInter<T>{
	
	private T name;
	
	public GenClass(T name) {
		this.name = name;
	}
	
	public T getName() {
		return name;
	}
	
	public void setName(T name) {
		this.name = name;
	}
	
	@Override
	public void tell() {
		
	}
	
}

public class Test04 {
	
	public static void main(String[] args) {
		
		GenClass<String> genClass = new GenClass<String>("Java");
		System.out.println(genClass.getName());
	}

}
