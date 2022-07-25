package anySort;

import java.util.Random;

public class Entry {

	public static void main(String[] args) {
		Random random = new Random();
		int[]numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		
		System.out.println("/not sorted/");
		
		printArr(numbers);
		//QuicksortAlgorithm.quicksort(numbers, 0, numbers.length - 1);
		//QuicksortAlgorithm.quicksort(numbers);
		MergesortAlgorithm.mergesort(numbers);
		System.out.println("/sorted/");
		
		printArr(numbers);
		
	}
	
	private static void printArr(int[]numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
	}

}
