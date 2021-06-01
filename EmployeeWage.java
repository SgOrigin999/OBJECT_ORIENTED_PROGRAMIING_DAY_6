package com.bridgelab.employeewage.day6;

public class EmployeeWage {
	public static final int FULL_TIME = 1;

	public void checkAvilablity() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Emp Check Value::" + empCheck);
		if (empCheck == FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is not Present");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Main Branch of Day Six::");
		EmployeeWage emp = new EmployeeWage();
		System.out.println("Check Employee Avilablity::");
		emp.checkAvilablity();
	}
}
