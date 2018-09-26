package com.personal.Test;

public class Test {
	{
		System.out.println("object loading");
	}

	{
		System.out.println("object loading2");
	}

	static {
		System.out.println("static loading");
	}

	public Test() {
		System.out.println("test construct");
	}

	public static void main(String[] args) {

		System.out.println("main");
		new Test();
		new A();
		System.out.println("main2");

	}

	static class A {

	 	static {
			System.out.println("static A loading");
		}

		public A() {
			System.out.println("A loading");
		}
	}

}
