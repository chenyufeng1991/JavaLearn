package com.chenyufeng.lesson01;

public class Test03 {

	public static void main(String[] args) {
		
		System.out.println("3.758保留小数点后三位"+pround(3.758, 2));
	}
	
	static double pround(double value, int index){
		//（1）计算10的n次方
		double pow10 = Math.pow(10, index);
		
		//（2）定义result变量保存计算结果
		double result = value * pow10;
		
		//（3）对index+1位进行四舍五入
		result = Math.round(result);
		
		// （4）环境value值
		result = result / pow10;
		
		return result;
	}
}
