package com.chenyufeng.generic;


class Point<T>{
	private T x;
	private T	y;
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	
}

public class Test01 {
	

	public static void main(String[] args) {
		Point<String> point = new Point<String>();
		point.setX("101");
		point.setY("99");
		System.out.println(point.getX() + "    "+ point.getY());
	}

	

}
