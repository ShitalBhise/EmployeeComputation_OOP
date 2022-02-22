package oop.java;

import java.util.Random;

public class PartTimeEmp {

	class Employee {
		static final int FULL_TIME = 1;
		static final int PART_TIME = 2;
		static final int SALARY_PER_DAY = 20;

		public static int empCheck() {
			Random random = new Random();
			int empCheck = random.nextInt(3);
			return empCheck;
		}

		public static void empSalary(int empCheck) {
			int empWrkHrs = 0;
			if (empCheck == FULL_TIME) {
				empWrkHrs = 8;
			} else if (empCheck == PART_TIME) {
				empWrkHrs = 4;
			} else {
				empWrkHrs = 0;
			}
			int empWage = empWrkHrs * SALARY_PER_DAY;
			System.out.println("Employee Wage is = " + empWage);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to part time Employee");
		int empCheck = Employee.empCheck();
		Employee.empSalary(empCheck);
	}

}