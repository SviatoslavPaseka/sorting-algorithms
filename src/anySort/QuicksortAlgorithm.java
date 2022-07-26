package anySort;

public class QuicksortAlgorithm {
	//use quicksort for all array
	public static void quicksort(int[]array) {
		quicksort(array, 0, array.length - 1);
	}
	
	public static void quicksort(int[]array, int lowIndex, int highIndex) {
		if (lowIndex>=highIndex) {
			return;
		}
		//choose the pivot is a last element
		int pivot = array[highIndex];
		//now we find a index to separation our array to using recursion for each part
		int leftPoint = separation(array, lowIndex, highIndex, pivot);
		
		//use recursion to each part of input array
		
		//to left part we take our lowindex to lowindex for next iteration 
		//and to high index we take a value before the index where our pointers met
		
		//to left part we take a value after the index where our pointers met
		//to high index we take our highindex
		quicksort(array, lowIndex, leftPoint - 1);
		quicksort(array, leftPoint + 1, highIndex);
	}

	private static int separation(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPoint = lowIndex, rightPoint = highIndex;
		
		//iterate the current array until the left point is equal to the right point
		while (leftPoint < rightPoint) {
			//iterate until the moment when number on left point is a greater or equal pivot
			while (array[leftPoint] <= pivot && leftPoint < rightPoint) {
				leftPoint++;
			}
			//iterate until the moment when number on left point is a less or equal pivot
			while (array[rightPoint] >= pivot && leftPoint < rightPoint) {
				rightPoint--;
			}
			//we swap left point number and right point number
			swaping(array, leftPoint, rightPoint);
		}
		//and we swap pivot in with the value that our left point pointing that
		swaping(array, leftPoint, highIndex);
		return leftPoint;
	}
	
	//method for a swapping to element each other
	private static void swaping(int[] arrayToSwap, int index1, int index2) {
		int temp = arrayToSwap[index1];
		arrayToSwap[index1] = arrayToSwap[index2];
		arrayToSwap[index2] = temp;
	}
}
