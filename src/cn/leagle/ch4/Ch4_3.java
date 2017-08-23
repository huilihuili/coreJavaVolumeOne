package cn.leagle.ch4;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import cn.leagle.ch5.Employee;

public class Ch4_3 {

	/*
	 * 
	 */
	@Test
	public void test() {
		EmployeeTest harry = new EmployeeTest("harry", 75000, 1987, 12, 15);
		Date date = harry.getHireDay();
		System.out.println(harry.getHireDay());

		double tenYearsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
		date.setTime(date.getTime() - (long) tenYearsInMilliSeconds);
		System.out.println(harry.getHireDay());

	}

	@Test
	public void test1() {
		EmployeeTest harry = new EmployeeTest("harry", 75000, 1987, 12, 15);
		EmployeeTest bob = new EmployeeTest("bob", 75000, 1987, 12, 15);
		System.out.println(harry.getName());
		System.out.println(bob.getName());

		EmployeeTest.swap(harry, bob);

		System.out.println(harry.getName());
		System.out.println(bob.getName());
	}

	@Test
	public void test2() {

		/*
		 * Test 1:Method can't modify numeric parameters
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before: percent=" + percent);
		tripleValue(percent);
		System.out.println("After: percent+" + percent);

		/*
		 * Test 2:Methods can change the state of object parameters
		 */

		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("harry", 75000, 1987, 12, 15);
		System.out.println("Before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary=" + harry.getSalary());

		/*
		 * Method can't attach new objects to object parameters
		 */

		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 75000, 1987, 12, 15);
		Employee b = new Employee("Bob", 75000, 1987, 12, 15);
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: b=" + b.getName());
		swap(a, b);
		System.out.println("After: a=" + a.getName());
		System.out.println("After: b=" + b.getName());
	}

	@Test
	public void test3() {
		Employee employee = new Employee();
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getHireDay());

		Date date = employee.getHireDay();
		date.setTime(12345);
		System.out.println(date);
	}

	public static void tripleValue(double x) {
		x = x * 3;
		System.out.println("End of method:" + x);
	}

	public static void tripleSalary(Employee x) {
		x.raiseSalary(200);
		System.out.println("End of method: salary=" + x.getSalary());
	}

	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;

		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());
	}
}

class EmployeeTest {

	public EmployeeTest(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return (Date) hireDay.clone();
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public static void swap(EmployeeTest x, EmployeeTest y) {
		EmployeeTest temp = x;
		x = y;
		y = temp;
	}

	private String name;
	private double salary;
	private Date hireDay;
}
