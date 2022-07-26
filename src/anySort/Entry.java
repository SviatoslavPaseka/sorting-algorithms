package anySort;

import java.util.List;
import java.util.Random;

/*testing class:)*/
public class Entry {

	public static void main(String[] args) {
		//creating test array and fill it random value
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
		
		numbers = fillTestArray();
		System.out.println("Heapsort\n/not sorted/");
		printSorted(numbers);
		HeapsortAlgorithm.heapsort(numbers);
		System.out.println("/sorted/");
		printSorted(numbers);
		
		numbers = fillTestArray();
		System.out.println("Selection sort\n/not sorted/");
		printSorted(numbers);
		SelectionsortAlgorithm.selectionsort(numbers);
		System.out.println("/sorted/");
		printSorted(numbers);
	}
	//method to filling array random values
	private static int[] fillTestArray() {
		Random random = new Random();
		int[]numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		return numbers;
	}
	//method to printing arrays in console
	private static void printSorted(int[]numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\n");
	}
	//method to printing lists in console
	private static void printSorted(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i)+" ");
		}
		System.out.println("\n");
	}

}
