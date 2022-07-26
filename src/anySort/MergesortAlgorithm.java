package anySort;

public class MergesortAlgorithm {
	public static void mergesort(int[]array) {
		int lengthOfArray = array.length;
		//array with a length equals 1 is already sorted
		if (lengthOfArray < 2) {
			return;
		}
		//pick mid element
		int centerIndex = lengthOfArray/2;
		//create subarray to left and right half 
		//left half take element from start input array to mid element
		//right half start from a center to end of input array
		int[]leftHalf = new int[centerIndex];
		int[]rightHalf = new int[lengthOfArray - centerIndex];
		
		//fill arrays
		for (int i = 0; i < centerIndex; i++) {
			leftHalf[i] = array[i];
		}
		for (int i = centerIndex; i < lengthOfArray; i++) {
			rightHalf[i - centerIndex] = array[i];
		}
		//use recursion mergesort algorithm to each half
		mergesort(leftHalf);
		mergesort(rightHalf);
		
		//at this moment we merge our two sorted half
		merge(array, leftHalf, rightHalf);
	}
	private static void merge(int[]input, int[] left, int[] right) {
		int lengthLeft = left.length;
		int lengthRight = right.length;
		
		//initialize iterator for a each array
		int pointerLeft = 0, pointerRight = 0, pointerResult = 0;
		
		//we iterate over both(2) sorted arrays and put the smaller of the elements into the result array
		while (pointerLeft < lengthLeft && pointerRight < lengthRight) {
			if (left[pointerLeft] < right[pointerRight]) {
				input[pointerResult] = left[pointerLeft];
				pointerLeft++;
			}else {
				input[pointerResult] = right[pointerRight];
				pointerRight++;
			}
			pointerResult++;
		}
		
		//if we don't take all the element from one of the arrays(FE: left iterator < length left array),
		//then we get them to the end (result array)
		while(pointerLeft < lengthLeft) {
			input[pointerResult] = left[pointerLeft];
			pointerResult++;
			pointerLeft++;
		}
		while(pointerRight < lengthRight) {
			input[pointerResult] = right[pointerRight];
			pointerResult++;
			pointerRight++;
		}
	}
}
