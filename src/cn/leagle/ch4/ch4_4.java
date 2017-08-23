package cn.leagle.ch4;

import java.util.Random;

import org.junit.Test;

public class ch4_4 {

	@Test
	public void test() {
		Employer[] employers = new Employer[3];
		
		employers[0] = new Employer("Harry", 40000);
		employers[1] = new Employer(60000);
		employers[2] = new Employer();
		
		for (Employer employer : employers)
			System.out.println("name=" + employer.getName() + ",id=" + employer.getId() + ",salary=" + employer.getSalary());
				
	}
}

class Employer {

	public Employer(String n, double s) {
		name = n;
		salary = s;
//		id = 5;
	}
	
	public Employer(double s) {
		this("Enployee #" + nextId, s);
	}
	
	public Employer() {
		// name initialized to "" see below
		// salary not explicitly set--initialized to 0
		// id initialized in initialization block
//		id = 5;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	private static int nextId;

	private int id;
	private String name = ""; // instance field initialization
	private double salary;
	
	// static initialization block
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	// object initialization block
	{
		id = nextId;
		nextId ++;
	}
}