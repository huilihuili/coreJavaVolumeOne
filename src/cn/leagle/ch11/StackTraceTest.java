package cn.leagle.ch11;

/**
 * 
 * @ClassName: StackTraceTest   
 * @Description: A program that display a trace feature of a recursive method call.
 * @author: leagle
 * @date: 2017年9月7日 下午9:56:09
 */
public class StackTraceTest {

	/**
	 * 
	 * @Title: StackTraceTest   
	 * @Description: Computes the factorial of a number
	 * @param n a nonnegative integer
	 * @return n! = 1 * 2 * . . . * n
	 */
	public static int factorial(int n) {

		System.out.println("factorial(" + n + ")");
		Throwable t = new Throwable();
		StackTraceElement[] frames = t.getStackTrace();
		for (StackTraceElement f : frames)
			System.out.println(f);
		int r;
		if (n <= 1) {
			r = 1;
		} else {
			r = n * factorial(n - 1);
		}
		System.out.println("return " + r);
		return r;
	}
	
	public static void main(String[] args) {
		int n =5;
		factorial(n);
	}
}
