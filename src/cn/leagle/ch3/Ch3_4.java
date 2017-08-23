package cn.leagle.ch3;

import java.math.BigInteger;
import java.util.Arrays;

import org.junit.Test;

public class Ch3_4 {

	@Test
	public void test() {
		System.out.println("---");
		double x = 0;
		for (int i = 0; i < 11; i++) {
			x += 0.1;
			System.out.println(x);
		}
	}

	@Test
	public void test1() {
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		int k = 60;
		int n = 490;
		/*
		 * n*(n-1)*...*(n-k+1)/(1*2*3*...*k)
		 */
		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1))
					.divide(BigInteger.valueOf(i));
		}
		System.out
				.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}

	@Test
	public void test2() {
		int[] a;
		a = new int[1];
		a[0] = 1;
		System.out.println(a[0]);

		int[] b = new int[5];
		b[0] = 1;
		System.out.println(b.length);

		System.out.println(Arrays.toString(b));

		int[] c = new int[0];
		System.out.println(Arrays.toString(c));
	}

	@Test
	public void test3() {
		int[] a = { 1, 2, 3, 4 };
		int[] b = a;

		b[0] = 5;
		System.out.println(a[0]);
		System.out.println(b[0]);

		int[] c = Arrays.copyOf(a, a.length);
		c[0] = 2;
		System.out.println(c[0]);
		System.out.println(a[0]);

	}

	@Test
	public void test4() {
		int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
		int[] luckyNumbers = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };

		System.arraycopy(smallPrimes, 2, luckyNumbers, 3, 4);
		for (int i = 0; i < luckyNumbers.length; i++)
			System.out.println(i + ":" + luckyNumbers[i]);

	}

	@Test
	public void test5() {
		int n = 10, k = 4;
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 1;

		int[] result = new int[k];
		for (int i = 0; i < result.length; i++) {
			int r = (int) (Math.random() * n);

			result[i] = numbers[r];

			numbers[r] = numbers[n - 1];
			n--;
		}
		
		Arrays.sort(result);
		System.out.println("Bet the follwing combination. It'll make you rich!");
		
		for(int r : result)
			System.out.println(r);
	}
	
	@Test
	public void test6() {
		System.out.println("---");
		
		final double STARTRATE = 10;
		
		final int NRATES = 6;
		final int NYEARS = 10;
		
		double[] interestRate = new double[NRATES];
		for (int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j) / 100.0;
		
		double[][] balances = new double[NYEARS][NRATES];
		
		for (int j = 0; j < balances[0].length; j++)
			balances[0][j] = 10000;
		
		for (int i = 1; i < balances.length; i++) {
			for (int j = 0; j < balances[i].length; j++) {
				double oldBalance = balances[i - 1][j];
				double interest = oldBalance * interestRate[j];
				
				balances[i][j] = oldBalance + interest;
			}
		}
		
		for (int j = 0; j < interestRate.length; j++)
			System.out.printf("%9.0f%%", 100 * interestRate[j]);
		System.out.println();
		
		for (double[] row : balances) {
			for (double b : row) 
				System.out.printf("%10.2f", b);
			System.out.println();
		}
	}
}
