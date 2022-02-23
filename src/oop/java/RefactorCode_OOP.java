package oop.java;

import java.util.Random;

public class RefactorCode_OOP {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private String company = "";
	private int empRatePerHour = 0;
	private int numOfWorkingDays = 0;
	private int maxHoursPerMonth = 0;

	public RefactorCode_OOP(String company, int perHrRate, int numOfWorkingDays, int hrsPerMonth) {
		super();
		this.company = company;
		this.empRatePerHour = perHrRate;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = hrsPerMonth;
	}

	public static void totalEmpWage() {
		RefactorCode_OOP Myntra = new RefactorCode_OOP("Myntra", 20, 20, 100);
		Random random = new Random();
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		while (totalWorkingDays < Myntra.numOfWorkingDays && totalWorkingHours < Myntra.maxHoursPerMonth) {
			totalWorkingDays++;
			int empCheck = random.nextInt(3);
			int empHrs = 0;
			switch (empCheck) {

			case IS_PART_TIME -> empHrs = 4;

			case IS_FULL_TIME -> empHrs = 8;

			default -> empHrs = 0;

			}
			totalWorkingHours = empHrs + totalWorkingHours;
			empWage = empHrs * Myntra.empRatePerHour;
			System.out.println("day " + totalWorkingDays + " = " + empWage);
			totalEmpWage = empWage + totalEmpWage;

		}
		System.out.println("salary of " + Myntra.company + " employee is " + totalEmpWage);

	}

	public static void main(String[] args) {
		totalEmpWage();

	}
}
