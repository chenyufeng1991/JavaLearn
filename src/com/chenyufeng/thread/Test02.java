package com.chenyufeng.thread;

class MyThread extends Thread{
	
	private String name;
	
	public MyThread(String name) {
		this.name  = name;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			//获得线程名字
			try {
				sleep(1000); //休眠
				System.out.println(Thread.currentThread().getName() );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}

public class Test02 {
	
	public static void main(String[] args) {

		MyThread thread = new MyThread("A");
		MyThread thread2 = new MyThread("B");
		System.out.println(thread.isAlive()); //启动之前肯定是未启动状态
		thread.start();
//		thread2.start();
		System.out.println(thread.isAlive()); //启动之后
	
	
		
//		thread.start();
//		for (int i = 0; i < 50; i++) {
//			if (i >= 10) {
//				try {
//					thread.join();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				} // 线程的强制执行
//			}
//			System.out.println(i);
//		}
	}

}
