package com.mindgate.pojo;

public class B extends A {
//	public void print() {
//		System.out.println("in class B print");
//		A a = new A();
//		a.display();
//	}

	B() {
		System.out.println("Hello");
	}

	B(int x) {
		//by default super() is called i.e. "Hi"
		super(x);
		System.out.println("Hello "+ x);
	}
}
