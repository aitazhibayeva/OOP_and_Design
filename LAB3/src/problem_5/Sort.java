package problem_5;

public class Sort {
	
	static <E extends Comparable<E>> void swap(E[] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	static <E extends Comparable<E>> void BubbleSort(E[] array) {
		int n = array.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0 ; j < n - i - 1; j++) {
				if(array[j].compareTo(array[j + 1]) > 0) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	static <E extends Comparable<E>> void SelectionSort(E[] array) {
	    int n = array.length;

	    for (int i = 0; i < n - 1; i++) {
	        int minimum = i;
	        for (int j = i + 1; j < n; j++) {
	            if (array[j].compareTo(array[minimum]) < 0) {
	                minimum = j;
	            }
	        }
	        if (minimum != i) {
	            swap(array, i, minimum);
	        }
	    }
	}

}