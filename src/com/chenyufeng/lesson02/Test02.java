package com.chenyufeng.lesson02;

public class Test02 {

	//静态初始化
	public static void main(String[] args) {
		
		//静态初始化，在声明的时候直接指定值，不使用new
		int array[] = {2,3,4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
	}
}
