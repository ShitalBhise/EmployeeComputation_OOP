package oop.java;

import java.util.Random;

public class PresentAbsent {

	class Emp {
		static final int Full_Time = 1;

		public static void empCheck() {
			Random r1 = new Random();
			int empcheck = r1.nextInt(2);

			if (empcheck == Full_Time) {
				System.out.println("Present");
			} else {
				System.out.println("Absent");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee is ");
		Emp.empCheck();
	}

}
