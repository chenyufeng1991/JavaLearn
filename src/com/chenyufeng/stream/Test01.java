package com.chenyufeng.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01 {
	
	public static void main(String[] args) {
		try {
			
			//读取操作
			FileInputStream fis = new FileInputStream("test.txt");
			byte by[] = new byte[40];
			fis.read(by);
			String string = new String(by);
			System.out.println(string);
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
