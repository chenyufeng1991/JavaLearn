package com.chenyufeng.lesson01;

import java.util.Scanner;

public class Test02 {
	
	static String name;
	static char sex;
	static short age;
	static float height;
	static String type;
	
	public static void main(String[] args) {
		//输入数据
		input();
		
		System.out.println("我是"+name+";我是"+sex+"的"+"今年我"+age+"岁"+"我的身高是"+height+"我的性格是"+type);
		
		feeling("学习Java", "好开心");
	}

	//使用command+alt+M   ：抽取一段代码成函数
	static void feeling(String cause, String feel) {
		System.out.println(cause + ";" + feel);
	}
	
	//封装成一个方法
	static void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("姓名：");
		name = scanner.next();
		System.out.println("性别：");
		sex = scanner.next().charAt(0);
		System.out.println("年龄：");
		age = scanner.nextShort();
		System.out.println("身高：");
		height = scanner.nextFloat();
		System.out.println("性格：");
		type = scanner.next();
		
		scanner.close();
	}
}
