package com.personal.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class Solution {
	public static void main(String[] args) {
		Employee[] emps = new Employee[] { new Employee("01:00", "02:00"), new Employee("16:00", "21:30"),
				new Employee("09:30", "13:00"), new Employee("21:00", "22:30"), new Employee("12:00", "12:30") };
		// String[] startTimes = new String[] {"01:00","16:00","09:30","21:00","12:00"};
		// String[] endTimes = new String[] {"02:00","21:30","13:00","22:30","12:30"};
		// List<Integer> starts = Arrays.stream(startTimes).map(val ->
		// getWeightedValue(val)).collect(Collectors.toList());
		List<Employee> sortedByStartTime = Arrays.stream(emps).sorted(new TimeComparator())
				.collect(Collectors.toList());

		int count = 0;
		Integer previousEndTime = 2400;
		List<Integer> alreadyRunningCabs = new ArrayList<>();
		for (int i = 0; i < sortedByStartTime.size(); i++) {
			Employee employee = sortedByStartTime.get(i);
			if (employee.getStartTime() < previousEndTime) {
				if (anyCabStillRunning(alreadyRunningCabs, employee.getEndTime())) {

				} else {
					count++;
					alreadyRunningCabs.add(employee.getEndTime());
				}
			}
			previousEndTime = employee.getEndTime();
			alreadyRunningCabs.add(employee.getEndTime());
		}
		System.out.println(count);
	}

	static boolean anyCabStillRunning(List<Integer> alreadyRunningCabs, Integer newEndTime) {
		for (Integer t : alreadyRunningCabs) {
			if (t > newEndTime) {
				return true;
			}
		}
        new PolymorphismExamples().methodOne(1);
		return false;
	}

}

class PolymorphismExamples {

    public void methodOne(int s) {
        System.out.println("int");
    }

    public void methodOne(Integer i) {
        System.out.println("integer");
    }


}

class Employee {
	Integer startTime;
	Integer endTime;

	public Employee(String startTime, String endTime) {
		this.startTime = getWeightedValue(startTime);
		this.endTime = getWeightedValue(endTime);
	}

	static Integer getWeightedValue(String time) {
		return Integer.parseInt(StringUtils.remove(time, ":"));
	}

	public Integer getStartTime() {
		return startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

}

class TimeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		Integer start1 = arg0.getStartTime();
		Integer start2 = arg1.getStartTime();
		return start1.compareTo(start2);
	}

	static Integer getWeightedValue(String time) {
		return Integer.parseInt(StringUtils.remove(time, ":"));
	}

}
