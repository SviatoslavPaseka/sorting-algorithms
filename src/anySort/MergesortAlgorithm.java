package anySort;

public class MergesortAlgorithm {
	public static void mergesort(int[]array) {
		int lengthOfArray = array.length;
		if (lengthOfArray < 2) {
			return;
		}
		
		int centerIndex = lengthOfArray/2;
		
		int[]leftHalf = new int[centerIndex];
		int[]rightHalf = new int[lengthOfArray - centerIndex];
		
		for (int i = 0; i < centerIndex; i++) {
			leftHalf[i] = array[i];
		}
		
		for (int i = centerIndex; i < lengthOfArray; i++) {
			rightHalf[i - centerIndex] = array[i];
		}
		
		mergesort(leftHalf);
		mergesort(rightHalf);
		
		merge(array, leftHalf, rightHalf);
	}
	private static void merge(int[]input, int[] left, int[] right) {
		int lengthLeft = left.length;
		int lengthRight = right.length;
		
		int pointerLeft = 0, pointerRight = 0, pointerResult = 0;
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
