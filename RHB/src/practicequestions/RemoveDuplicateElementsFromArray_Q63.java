package practicequestions;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArray_Q63 {
	public static void main(String[] args) {
		int[] array = { 10, 20, 10, 30, 20 };
		System.out.println("Original array: " + Arrays.toString(array));

		// Sort the array
		Arrays.sort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));

		// Count unique elements
		int uniqueCount = 1; // first element is always unique
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				uniqueCount++;
			}
		}

//		i=1: 10 != 10? no ->skip
//		i=2: 20 != 10? yes -> uniqueCount = 2
//		i=3: 20 != 20? no -> skip
//		i=4: 30 != 20? yes -> uniqueCount = 3

		// Store unique elements in a new array
		int[] uniqueArray = new int[uniqueCount]; // int[3]
		uniqueArray[0] = array[0];
		int index = 1;

		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				uniqueArray[index] = array[i];
				index++;
			}
		}

		System.out.println("Array after removing duplicates: " + 
		Arrays.toString(uniqueArray));
	}
}




