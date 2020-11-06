
/**
 * Desc   - Sort the array and return the second smallest element in the array
 * @author Janani S
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallestNumber {
	/**
	 * Sort the array and return the second smallest element in the array
	 * 
	 * @param array
	 * @return second
	 */
	public static int getSecondSmallest(int[] array) {
		ArrayList<Integer> list = new ArrayList<>();
		/**
		 * Storing the array elements into the list
		 */
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		/**
		 * Sorting the list
		 */
		Collections.sort(list);
		int secondSmallest = list.get(1); // Storing the second smallest number in separate variable
		return secondSmallest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number = sc.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[number];
		/**
		 * Getting the elements from user and storing it into the array
		 */
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		int secondSmallest = getSecondSmallest(arr); // Function Call
		System.out.println(secondSmallest); // Printing the second smallest number
		sc.close();
	}

}
