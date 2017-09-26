package cn.leagle.ch13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 49; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		Collections.shuffle(numbers);
		System.out.println(numbers);
		
		List<Integer> winningCombination = numbers.subList(0, 6);
		System.out.println(winningCombination);
		Collections.sort(winningCombination);
		System.out.println(winningCombination);
	}
	
	
}
