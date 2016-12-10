package com.chenyufeng.lesson01;

public class Test05 {

	//加运算
	public static void main(String[] args) {
		
		//按从左到右的顺序执行
		//字符串在最左边，右边的数字加法也作为字符串处理
		System.out.println("" + 1 + 2);
		
		//字符串在最右边，左侧的数字加法正常处理
		System.out.println(3 + 5 + "12");

	}

}
