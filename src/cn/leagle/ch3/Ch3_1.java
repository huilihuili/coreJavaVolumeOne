package cn.leagle.ch3;

import org.junit.Test;

/**
 * @author Leagle
 * 
 * 测试操作符<<, >>, >>>
 *
 */

public class Ch3_1 {
	
	/**
	 * 理解原码、反码和补码
	 * 
	 */
	@Test
	public void test() {
		int a = 3;
		int b = -3;
		int c = Integer.MIN_VALUE;
		int d = Integer.MAX_VALUE;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(Integer.toBinaryString(c));
	}
	
	
	
	
	/**
	 * <<操作符的测试：
	 * 左移，低位补0
	 * 
	 */
	@Test
	public void test1() {
		System.out.println("<<操作符的测试：");
		
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE + 1;
		
		
		System.out.println(maxValue);
		System.out.println(Integer.toBinaryString(maxValue));
		int temp = maxValue << 2;
		System.out.println(temp);
		System.out.println(Integer.toBinaryString(temp));
		
		System.out.println(minValue);
		System.out.println(Integer.toBinaryString(minValue));
		temp = minValue << 2;
		System.out.println(temp);
		System.out.println(Integer.toBinaryString(temp));
	}
	
	
	/**
	 * >>操作符的测试：
	 * 右移，高位补符号位
	 * 
	 */
	@Test
	public void test2() {
		System.out.println(">>操作符的测试：\n\n");
		
		System.out.println(2);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(2 >> 1);
		System.out.println(Integer.toBinaryString(2 >> 1));
		System.out.println();

		System.out.println(-2);
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(-2 >> 1);
		System.out.println(Integer.toBinaryString(-2 >> 1));
		System.out.println();

		System.out.println(5);
		System.out.println(Integer.toBinaryString(5));
		System.out.println(5 >> 1);
		System.out.println(Integer.toBinaryString(5 >> 1));
		System.out.println();

		System.out.println(-5);
		System.out.println(Integer.toBinaryString(-5));
		System.out.println(-5 >> 1);
		System.out.println(Integer.toBinaryString(-5 >> 1));
	}
	
	/**
	 * >>>操作符的测试：
	 * 右移，高位补0
	 * 
	 */
	@Test
	public void test3() {
		System.out.println(">>>操作符的测试：\n\n");
		
		System.out.println(2);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(2 >>> 1);
		System.out.println(Integer.toBinaryString(2 >>> 1));
		System.out.println();

		System.out.println(-2);
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(-2 >>> 1);
		System.out.println(Integer.toBinaryString(-2 >>> 1));
		System.out.println();

		System.out.println(5);
		System.out.println(Integer.toBinaryString(5));
		System.out.println(5 >>> 1);
		System.out.println(Integer.toBinaryString(5 >>> 1));
		System.out.println();

		System.out.println(-5);
		System.out.println(Integer.toBinaryString(-5));
		System.out.println(-5 >>> 1);
		System.out.println(Integer.toBinaryString(-5 >>> 1));
	}
	
	
	/**
	 * >> 和 >>>的区别
	 * 使用正数时，没有区别，因为正数的符号位是0，高位补的数字都是一样的
	 * 使用负数时，有区别，因为负数的符号位是1，>>补的是符号位是1，而>>>补的是0
	 */
	@Test
	public void test4() {
		System.out.println(">>> 和  >> 的区别：\n\n");
		
		System.out.println(10);
		System.out.println(Integer.toBinaryString(10));
		System.out.println(10 >> 1);
		System.out.println(Integer.toBinaryString(10 >> 1));
		System.out.println(10 >>> 1);
		System.out.println(Integer.toBinaryString(10 >>> 1));
		System.out.println();

		System.out.println(-10);
		System.out.println(Integer.toBinaryString(-10));
		System.out.println(-10 >> 1);
		System.out.println(Integer.toBinaryString(-10 >> 1));
		System.out.println(-10 >>> 1);
		System.out.println(Integer.toBinaryString(-10 >>> 1));
		System.out.println();
	}

}
