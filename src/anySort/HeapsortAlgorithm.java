package anySort;

public class HeapsortAlgorithm {
	public static void heapsort(int[]data) {
		int size = data.length;
		
		//Building a heap (rearrange the array)
		for (int i = size/2 - 1; i >= 0; i--) {
			heapify(data, i, size);
		}
		//Retrieving elements from the heap one by one
		for (int i = size - 1; i >= 0; i--) {
			//swap current root to end 
			int temp = data[i];
			data[i] = data[0];
			data[0] = temp;
			
			//callng heapify for a reduced heap
			heapify(data, 0, i);
		}
	}

	/*
	 * Procedure for converting to a binary heap of a subtree with root node i,
	 * which is index in arr[]. size - heap size
	 */
	private static void heapify(int[] data, int i, int size) {
		int leftChild = i * 2 + 1;	//left child for current root 2*i+1
		int rightChild = i * 2 + 2;	//right child for current root 2*i+2
		int largestEl = i;			//initialization of largest element like a root
		
		//if the left child greater than the root
		if (leftChild < size && data[leftChild] > data[largestEl]) {
			largestEl = leftChild;
		}
		//if the right child greater than the largest element now
		if (rightChild < size && data[rightChild] > data[largestEl]) {
			largestEl = rightChild;
		}
		//if largest elemnt is not the root
		if (i != largestEl) {
			int tmp = data[i];
			data[i] = data[largestEl];
			data[largestEl] = tmp;
			//use recursion to rebuild to binary heap current subtree
			heapify(data, largestEl, size);
		}
	}
}
