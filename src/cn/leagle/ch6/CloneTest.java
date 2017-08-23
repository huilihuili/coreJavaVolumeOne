package cn.leagle.ch6;

import java.util.Date;
import java.util.GregorianCalendar;

public class CloneTest {
	public static void main(String[] args) {
		try {
			Employee original = new Employee("leagle", 50000);
			original.setHireDay(2020, 6, 6);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2022, 7, 8);
			System.out.println("original = " + original);
			System.out.println("copy = " + copy);
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class Employee implements Cloneable {
	public Employee() {

	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		hireDay = new Date();
	}

	public Employee clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();

		cloned.hireDay = (Date) hireDay.clone();

		return cloned;
	}

	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	/**
	 * Set the hire day to a given date.
	 * @param year the year of the hire day
	 * @param month the month of the hire day
	 * @param day the day of the hire day
	 */
	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
		hireDay.setTime(newHireDay.getTime());
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}

	private String name;
	private double salary;
	private Date hireDay;
}