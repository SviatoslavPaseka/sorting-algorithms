package anySort;

//always O(n^2)
public class SelectionsortAlgorithm {
	public static void selectionsort(int[]data) {
		//One by one move boundary of unsorted subarray to right
        for (int i = 0; i < data.length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < data.length; j++)
                if (data[j] < data[min])
                    min = j;
  
            // Swap the found minimum element with the first element
            swap(data, i, min);
        }
	}

	private static void swap(int[] data, int i, int min) {
		int temp = data[min];
		data[min] = data[i];
		data[i] = temp;
	}

	
}
