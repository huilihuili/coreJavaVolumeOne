package cn.leagle.ch3;

import org.junit.Test;

/**
 * @author Leagle
 * 
 * ���Բ�����<<, >>, >>>
 *
 */

public class Ch3_1 {
	
	/**
	 * ���ԭ�롢����Ͳ���
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
	 * <<�������Ĳ��ԣ�
	 * ���ƣ���λ��0
	 * 
	 */
	@Test
	public void test1() {
		System.out.println("<<�������Ĳ��ԣ�");
		
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
	 * >>�������Ĳ��ԣ�
	 * ���ƣ���λ������λ
	 * 
	 */
	@Test
	public void test2() {
		System.out.println(">>�������Ĳ��ԣ�\n\n");
		
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
	 * >>>�������Ĳ��ԣ�
	 * ���ƣ���λ��0
	 * 
	 */
	@Test
	public void test3() {
		System.out.println(">>>�������Ĳ��ԣ�\n\n");
		
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
	 * >> �� >>>������
	 * ʹ������ʱ��û��������Ϊ�����ķ���λ��0����λ�������ֶ���һ����
	 * ʹ�ø���ʱ����������Ϊ�����ķ���λ��1��>>�����Ƿ���λ��1����>>>������0
	 */
	@Test
	public void test4() {
		System.out.println(">>> ��  >> ������\n\n");
		
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
