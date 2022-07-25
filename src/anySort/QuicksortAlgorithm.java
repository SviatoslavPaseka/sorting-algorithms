package anySort;

public class QuicksortAlgorithm {
	public static void quicksort(int[]array) {
		quicksort(array, 0, array.length - 1);
	}
	public static void quicksort(int[]array, int lowIndex, int highIndex) {
		
		if (lowIndex>=highIndex) {
			return;
		}
		
		int pivot = array[highIndex];
		int leftPoint = separation(array, lowIndex, highIndex, pivot);
		
		quicksort(array, lowIndex, leftPoint - 1);
		quicksort(array, leftPoint + 1, highIndex);
		
		
	}

	private static int separation(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPoint = lowIndex, rightPoint = highIndex;
		
		while (leftPoint < rightPoint) {
			while (array[leftPoint] <= pivot && leftPoint < rightPoint) {
				leftPoint++;
			}
			while (array[rightPoint] >= pivot && leftPoint < rightPoint) {
				rightPoint--;
			}
			swaping(array, leftPoint, rightPoint);
		}
		swaping(array, leftPoint, highIndex);
		return leftPoint;
	}
	
	private static void swaping(int[] arrayToSwap, int index1, int index2) {
		int temp = arrayToSwap[index1];
		arrayToSwap[index1] = arrayToSwap[index2];
		arrayToSwap[index2] = temp;
	}
}
