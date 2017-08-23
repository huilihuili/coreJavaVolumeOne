package cn.leagle.ch3;

import java.util.Scanner;

import org.junit.Test;

public class Ch3_3 {

	@Test
	public void test() {
		System.out.println("---");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println(name);
		
		int age = in.nextInt();
		System.out.println(age);
	}
	
}
