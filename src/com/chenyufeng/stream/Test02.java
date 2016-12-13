package com.chenyufeng.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	
	public static void main(String[] args) {
		
		try {
			//输出数据
			FileOutputStream fos = new FileOutputStream("test02.txt");
			String string = "123456lala啦啦";
		    byte by[]	=  string.getBytes();
		    fos.write(by);
		    
		    fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
