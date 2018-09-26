package com.personal.Test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		Integer expectedRows = Integer.parseInt(args[0]);
		for (int i = 0; i < expectedRows; i++) {
			Integer initialValue = Integer.parseInt(args[i + 1]);
			List<Integer> finalValues = new ArrayList<>();
			executeLogic(initialValue, finalValues);
			int finalValueOfCoins = finalValues.stream().mapToInt(Integer::intValue).sum();
			System.out.println("Final coins are: " + finalValues);
			System.out.println("Profit is: " + (finalValueOfCoins - initialValue));
		}

	}

	static void executeLogic(Integer initialValue, List<Integer> finalValues) {
		boolean divisionProfitable = isDivisionProfitable(initialValue);
		if (divisionProfitable) {
			Integer[] dividedValues = getDividedValues(initialValue);
			for (Integer val : dividedValues) {
				executeLogic(val, finalValues);
			}
		} else {
			finalValues.add(initialValue);
		}
	}

	static boolean isDivisionProfitable(Integer initial) {
		Integer val2 = initial / 2;
		Integer val3 = initial / 3;
		Integer val4 = initial / 4;
		if ((val2 + val3 + val4) > initial) {
			return true;
		}
		return false;
	}

	static Integer[] getDividedValues(Integer initial) {
		return new Integer[] { initial / 2, initial / 3, initial / 4 };
	}
}
