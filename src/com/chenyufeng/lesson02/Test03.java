package com.chenyufeng.lesson02;

public class Test03 {
	
	public static void main(String[] args) {
		//二维数组的静态初始化
		int array1[][] = {{100, 90}, {4,8}, {11,67}};
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
