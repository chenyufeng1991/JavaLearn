package com.chenyufeng.generic;

public class Test06 {
	
	public static void main(String[] args) {
		
		String arr[] = {"we","are","won"};
		tell(arr);
	}
	
	//泛型数组结合泛型方法
	public static  <T>void tell(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
