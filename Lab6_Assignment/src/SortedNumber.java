
/**
 * Desc  - Return the resulting array after reversing the numbers and sorting it 
 * @author Janani S
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedNumber {
	/**
	 * Accept and integer array, reverse the numbers in the array, sort it and
	 * return the resulting array.
	 * 
	 * @param inputArr
	 * @return resultArray
	 */
	public static int[] getSorted(int[] inputArr) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int[] resultArr = new int[inputArr.length];
		/**
		 * Converting the array element to string StringBuffer is used to make string
		 * mutable and then it is reversed
		 */
		for (int index = 0; index < inputArr.length; index++) {
			String str = Integer.toString(inputArr[index]);
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			/**
			 * The string is reversed and then the string is converted into integer After
			 * integer conversion it is added into the arrayList
			 */
			arrayList.add(Integer.parseInt(sb.toString()));
		}
		Collections.sort(arrayList); // The arrayList is sorted
		int itr = 0;
		for (int num : arrayList) {
			resultArr[itr++] = num; // The list element is added into the resultantArray
		}
		return resultArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number = sc.nextInt();
		int[] arr = new int[number];
		System.out.println("Enter the elements");
		/**
		 * Getting the numbers from the user and adding it into the input array
		 */
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		int[] resultArr = getSorted(arr); // Function Call
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]); // Printing the array elements
		}
		sc.close();
	}

}
