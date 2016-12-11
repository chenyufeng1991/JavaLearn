package com.chenyufeng.lesson02;

public class Test01 {
	
	public static void main(String[] args) {
		int array[]; //数组的声明
		//动态初始化，使用new
		array = new int[3]; //为数组开辟内存空间，实例化 
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
