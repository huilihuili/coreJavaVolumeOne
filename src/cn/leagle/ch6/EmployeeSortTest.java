package cn.leagle.ch6;
//package ch6;
//
//import java.util.Arrays;
//
///**
// * This program demonstrates the use of the Comparable interface
// * 
// * @author leagle
// *
// */
//public class EmployeeSortTest {
//	public static void main(String[] args) {
//
//		Employee[] staff = new Employee[3];
//
//		staff[0] = new Employee("harry", 3500);
//		staff[1] = new Employee("leagle", 9500);
//		staff[2] = new Employee("jack", 6500);
//
//		Arrays.sort(staff);
//
////		print out information about all Employee objects
//		for (Employee employee : staff)
//			System.out.println("name=" + employee.getName() + ",salary" + employee.getSalary());
//	}
//}
//
//class Employee implements Comparable<Employee> {
//	public Employee() {
//
//	}
//
//	public Employee(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//	}
//
//	public void raiseSalary(double byPercent) {
//		double raise = this.salary * byPercent / 100;
//		this.salary += raise;
//	}
// 
//	public String getName() {
//		return name;
//	}
//
//	public double getSalary() {
//		return salary;
//	}
//
//	private String name;
//	private double salary;
//
//	@Override
//	public int compareTo(Employee other) {
//		if (salary < other.salary)
//			return -1;
//		if (salary > other.salary)
//			return 1;
//		return 0;
//	}
//}
