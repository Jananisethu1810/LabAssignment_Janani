
/**
 * @author - Janani S
 * Desc    - Creating a method which accepts a hash map and 
 *           return the values of the map in sorted order as a List.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReturnValueMap {
	/**
	 * This method takes HashMap as a parameter. It gets the values of a map and
	 * stores it in the list, finally sorts the list.
	 * 
	 * @param hashMap
	 * @return list
	 */
	private static ArrayList<String> getValues(HashMap<Integer, String> hashMap) {
		ArrayList<String> list = new ArrayList<>();
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			/**
			 * Returns the value corresponding to this entry
			 */
			list.add(entry.getValue());
		}
		Collections.sort(list); // Sorting the list
		return list; // Returns the sorted list
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of pairs");
		int num = sc.nextInt();
		HashMap<Integer, String> hashMap = new HashMap<>(); // Creation of HashMap
		/**
		 * Adding Key-Value pairs into the HashMap
		 */
		for (int i = 0; i < num; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			hashMap.put(key, value);
		}
		ArrayList<String> list = getValues(hashMap); // Function Call
		/**
		 * Printing the sorted list
		 */
		for (String str : list) {
			System.out.println(str);
		}
		sc.close();

	}

}
