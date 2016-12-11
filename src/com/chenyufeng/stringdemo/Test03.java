package com.chenyufeng.stringdemo;

public class Test03 {
	
	public static void main(String[] args) {
		
		StringBuffer sbBuffer = new StringBuffer();
		sbBuffer.append("chen");
		System.out.println(sbBuffer.toString());
		
		tell(sbBuffer);
		System.out.println(sbBuffer.toString());
		
		//插入字符串
		StringBuffer sbBuffer2 = new StringBuffer();
		sbBuffer2.append("Java");
		System.out.println(sbBuffer2.insert(1, "8888").toString());
		
		
		//替换
		StringBuffer stringBuffer3 = new StringBuffer();
		stringBuffer3.append("Java");
		stringBuffer3.replace(0, 1, "C++++++");
		System.out.println(stringBuffer3.toString());
	}
	
	public static void tell(StringBuffer s) {
		s.append("love Java");
	}

}
