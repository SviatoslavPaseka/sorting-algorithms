package anySort;

import java.util.List;
import java.util.Random;

public class Entry {

	public static void main(String[] args) {
		int[] numbers = fillTestArray();
		System.out.println(" QUICKSORT\n/not sorted/");
		printSorted(numbers);
		//QuicksortAlgorithm.quicksort(numbers, 0, numbers.length - 1);
		QuicksortAlgorithm.quicksort(numbers);
		System.out.println("/sorted/");
		printSorted(numbers);
		
		numbers = fillTestArray();
		System.out.println("Mergesort\n/not sorted/");
		printSorted(numbers);
		MergesortAlgorithm.mergesort(numbers);
		System.out.println("/sorted/");
		printSorted(numbers);
		
		numbers = fillTestArray();
		System.out.println("Treesort\n/not sorted/");
		printSorted(numbers);
		TreesortAlgorithm ta = new TreesortAlgorithm();
		ta.treeInsert(numbers);
		ta.inOrderTraverseTree(ta.root);
		System.out.println("/sorted/");
		printSorted(ta.getSortedData());
	}

	private static int[] fillTestArray() {
		Random random = new Random();
		int[]numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		return numbers;
	}
	private static void printSorted(int[]numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\n");
	}
	private static void printSorted(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i)+" ");
		}
		System.out.println("\n");
	}

}
