package com.chenyufeng.stringdemo;

public class Test02 {
	
	public static void main(String[] args) {
		
		String string  = "chenyufeng";
		
		//计算字符串长度
		System.out.println(string.length());
		
		//字符串转化为字符数组
		char stringArr[] = string.toCharArray();
		for (int i = 0; i < stringArr.length; i++) {
			System.out.print(stringArr[i] + "   ");
		}
		System.out.println();
		
		//从字符串中取出指定位置的元素
		System.out.println(string.charAt(4));
		
		//字符串转化为byte数组
		byte bytes[] = string.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i] + "   ");
		}
		System.out.println();
		
		//过滤字符串中存在的字符,返回下标位置，如果没有找到，返回-1
		int index = string.indexOf("z");
		System.out.println(index);
		
		//去掉字符串前后的空格
		String temp = "         lalalala   ";
		System.out.println("字符串长度："+temp.length() + ",去掉前后空格："+ temp.trim() + ",去掉前后空格后的长度："+ temp.trim().length());
		
		//从字符串中取出子字符串,从某个位置开始的子字符串；
		String temp2 = "12345";
		System.out.println(temp2.substring(3));
		
		//字符串的大小写转换
		String temp3 = "ChenYuFeng";
		System.out.println(temp3.toLowerCase());
		System.out.println(temp3.toUpperCase());
		
		//判断字符串的开头结尾字符
		String temp4 = "chenyufeng";
		boolean isStartWith =  temp4.startsWith("chen");
		boolean isEndWith = temp4.endsWith("lala");
		System.out.println(isStartWith + "    "+ isEndWith);
		
		
		//替换String字符串中的一个字符,会搜索所有的相同的字符，仅仅只是字符的替换，而不是字符串
		String temp5 = "chenyufeng";
		System.out.println(temp5.replace('e', 'E'));
		
	}

}
