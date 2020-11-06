
/**
 * @author Janani S
 * Desc  - A method that accepts a character array and 
 *         count the number of times each character is present in the array.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounting {
	/**
	 * This method accepts the character array Count the number of times each
	 * character is present in the array Stores the character as key and count as a
	 * value in map
	 * 
	 * @param charArr
	 * @return map
	 */
	public static Map<Character, Integer> countChars(char[] charArr) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArr.length; i++) {
			char ch = charArr[i];
			if (map.containsKey(ch)) { // Checks whether the character present in that map
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		return map; // Returns the resultant map
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of characters");
		int number = sc.nextInt();
		char[] charArr = new char[number];
		// Entering the elements into the array
		for (int i = 0; i < number; i++) {
			charArr[i] = sc.next().charAt(0);
		}
		Map<Character, Integer> map = countChars(charArr); // Function Call
		/**
		 * Printing the character and count of that character
		 */
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		sc.close();
	}

}
