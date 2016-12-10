package com.chenyufeng.lesson01;

import java.util.Scanner;

public class Test01 {
	
	static String name;
	static char sex;
	static short age;
	static float height;
	static String type;
	
	public static void main(String[] args) {
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
		
		System.out.println("我是"+name+";我是"+sex+"的"+"今年我"+age+"岁"+"我的身高是"+height+"我的性格是"+type);
		scanner.close();
	}

}
