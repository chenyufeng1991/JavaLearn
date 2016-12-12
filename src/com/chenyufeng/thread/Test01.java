package com.chenyufeng.thread;

class ThreadTest extends Thread{
	
	private String name;
	public ThreadTest(String name) {
		this.name = name;
	}
	
	//重写run方法
	@Override
	public void run() {
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(name + ":" + i);
		}
		
		super.run();
	}
}

public class Test01 {
	
	public static void main(String[] args) {
		
		ThreadTest test = new ThreadTest("one");
		ThreadTest test2  = new ThreadTest("two");
		test.start(); //调用线程使用start()
		test2.start();
		
	}

}
