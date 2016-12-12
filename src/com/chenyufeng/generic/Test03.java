package com.chenyufeng.generic;

class Gen<T ,K>{
	private T make;
	private K take;
	
	public T getMake() {
		return make;
	}
	public void setMake(T make) {
		this.make = make;
	}
	public K getTake() {
		return take;
	}
	public void setTake(K take) {
		this.take = take;
	}
	
}

public class Test03 {

	public static void main(String[] args) {
		
		Gen<String,Integer> gen = new Gen<String, Integer>();
		gen.setMake("这是make");
		gen.setTake(12);
		System.out.println(gen.getMake() + "    "+ gen.getTake());

	}

}
