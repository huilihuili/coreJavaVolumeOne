package cn.leagle.ch5;

import java.lang.reflect.Array;

import org.junit.Test;

public class Ch5_1 {
	/**
	 * This method demonstrates the use of reflection for manipulating arrays.
	 */
	@Test
	public void arrayGrowTest() {
		int[] a = { 1, 2, 3 };
		a = (int[]) goodArrayGrow(a);
		arrayPrint(a);

		String[] b = { "Tom", "Dick", "Harry" };
		b = (String[]) goodArrayGrow(b);
		arrayPrint(b);

		Employee[] e = new Employee[2];
		e[0] = new Employee("Marry", 2000, 1995, 9, 2);
		e[1] = new Employee("Bob", 5000, 1997, 9, 2);
		e = (Employee[]) goodArrayGrow(e);
		getClass();
		arrayPrint(e);

		System.out.println("The following call will generate an exception");
		// b = (String[]) badArrayGrow(b);
	}

	/**
	 * This method attempts to grow an array by allocating a new array and copying
	 * all elements.
	 * 
	 * @param a
	 *            the array to grow
	 * @return a larger array that contains all elements of a. However, the returned
	 *         array has type Object[], not the same type as a
	 */
	static Object[] badArrayGrow(Object[] a) {
		int newLength = a.length * 11 / 10 + 10;
		Object[] newArray = new Object[newLength];
		System.arraycopy(a, 0, newArray, 0, a.length);
		return newArray;
	}

	/**
	 * This method grows an array by allocating a new array of the same type and
	 * copying all elements.
	 * 
	 * @param a
	 *            the array to grow. This can be an object array or a primitive type
	 *            array
	 * @return a larger array that contains all elements of a.
	 */
	static Object goodArrayGrow(Object a) {
		Class cl = a.getClass();
		if (!cl.isArray())
			return null;

		Class componentType = cl.getComponentType();
		int length = Array.getLength(a);
		int newLength = length * 11 / 10 + 10;

		Object newArray = Array.newInstance(componentType, newLength);
		System.arraycopy(a, 0, newArray, 0, length);
		return newArray;
	}

	static void arrayPrint(Object a) {
		Class cl = a.getClass();
		if (!cl.isArray())
			return;
		Class componentType = cl.getComponentType();
		int length = Array.getLength(a);
		System.out.print(componentType.getName() + "[" + length + "] = {");
		for (int i = 0; i < Array.getLength(a); i++)
			System.out.print(Array.get(a, i) + " ");
		System.out.println("}");
	}
}
