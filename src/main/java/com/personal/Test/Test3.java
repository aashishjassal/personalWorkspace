package com.personal.Test;

public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println("stage 1");
			throw new NullPointerException();
			// System.out.println("stage 2");
		} catch (NullPointerException e) {
			System.out.println("NPE");
		} catch (RuntimeException e) {
			System.out.println("RTE");
		} catch (Exception e) {
			System.out.println("Excep");
		} catch (Throwable t) {
			System.out.println("Throwable");
		} finally {
			System.out.println("Finally");
		}
	}
}
