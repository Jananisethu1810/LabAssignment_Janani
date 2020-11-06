
/**
 * author - Janani S
 * Desc   - Accepts a array of numbers and return their squares as a map
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SquareOfNumbers {
	/**
	 * This method accepts the integer and returns the map It adds the elements to a
	 * map object with the number as the key and the square as the value
	 * 
	 * @param array
	 * @return map
	 */
	public static Map<Integer, Integer> getSquares(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], array[i] * array[i]);
		}
		return map; // Returning the map
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number = sc.nextInt(); // Reading the number of elements in the array
		System.out.println("Enter the elements");
		// Reading the numbers to be added into the array
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		Map<Integer, Integer> squareMap = getSquares(arr); // Function Call by setting array as a parameter
		/**
		 * Printing the Key-Value pairs of the squareMap
		 */
		System.out.println("The resultant map is");
		for (Map.Entry<Integer, Integer> entry : squareMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		sc.close();
	}

}
