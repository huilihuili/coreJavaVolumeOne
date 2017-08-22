package cn.leagle.ch3;

import org.junit.Test;
import static java.lang.Math.*;

public class Ch3_2 {

	@Test
	public void test() {
		System.out.println(sqrt(4));
	}
	
	
	@Test
	public void test1() {
		int n = 123456789;
		float f = n;
		System.out.println(n);
		System.out.println(f);
	}
	
	@Test
	public void test2() {
		double x = 9.997;
		System.out.println(x);
		System.out.println(Math.round(x));
		int nx = (int) Math.round(x);
		System.out.println(nx);
	}
	
	@Test
	public void test3() {
		int x = 300;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		byte bx = (byte)x;
		System.out.println(bx);
		//10:A, 11:B, 12:C
		System.out.println(0x0000002C);
	}
	
	@Test
	public void test4() {
		String s = "Hello";
		s = s.substring(0, 3) + "p!";
		System.out.println(s);
	}
	
	/*
	 * 
	 * 只有字符串常量是共享的，�? + 和substring等操作产生的结果并不是共享的
	 */
	@Test
	public void test5() {
		String s = "Hello";
		
		if (s == "Hello") {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (s.substring(0, 3) == "Hel") {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}
	
	@Test
	public void test6() {
		String s = "Hello";
		int n = s.length();
		System.out.println(n);
		
		
		int cpCount = s.codePointCount(0, s.length());
		System.out.println(cpCount);
		
	}
	
	@Test
	public void test7() {
		String s = "Hello";
		int index = s.offsetByCodePoints(0, 2);
		int cp = s.codePointAt(index);
		System.out.println(index);
		System.out.println(cp);
		
		
		System.out.println(s.indexOf(cp));
	}
		
	
}
