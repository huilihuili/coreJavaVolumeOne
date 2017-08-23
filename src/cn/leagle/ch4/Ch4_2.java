package cn.leagle.ch4;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class Ch4_2 {

	@Test
	public void employeeTest() {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		for (Employee e : staff)
			e.raiseSalary(5);
		
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
	}
	
	/*
	 * ÆÆ»µ·â×°
	 */
	@Test
	public void test() {
		Employee harry = new Employee("harry", 75000, 1987, 12, 15);
		Date date = harry.getHireDay();
		System.out.println(harry.getHireDay());
		
		double tenYearsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
		date.setTime(date.getTime() - (long) tenYearsInMilliSeconds );
		System.out.println(harry.getHireDay());
		
	}
	
	/*
	 * ÆÆ»µ·â×°
	 */
	@Test
	public void test1() {
		Employee harry = new Employee("harry", 75000, 1987, 12, 15);
		Employee bob = new Employee("bob", 75000, 1987, 12, 15);
		System.out.println(harry.equals(bob));
		System.out.println(harry.equals(harry));
	}
}

class Employee {

	public Employee() {
		
	}
	
	public Employee(String n, double s, int year, int month, int day) {
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
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public boolean equals(Employee other) {
		return name.equals(other.name);
	}

	private String name;
	private double salary;
	private Date hireDay;
}
