package com.chenyufeng.lesson02;

public class test04 {

	public static void main(String[] args) {
		//二维数组的动态初始化
		int array[][] = new int[3][3];
		array[1][1] = 100;
		array[0][2] = 99;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
