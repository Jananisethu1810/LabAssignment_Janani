
/**
 * Desc   - Generate the list of voters based on the ages of the people 
 * @author Janani S
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VoterAgeVerification {
	public static ArrayList<Integer> voterList(HashMap<Integer, Integer> voterMap) {
		/**
		 * Accept a map with ID as key and Date of Birth as value and check if the
		 * person is eligible to vote. 
		 * A person is eligible for vote for if his age is
		 * greater than 18. If the person is eligible add his ID to the list.
		 */
		ArrayList<Integer> voterList = new ArrayList<>();
		for (HashMap.Entry<Integer, Integer> entry : voterMap.entrySet()) {
			/**
			 * Checks whether the age is greater than 18 or not If age is greater than 18
			 * than adds the id into the arrayList
			 */
			if (entry.getValue() > 18) {
				voterList.add(entry.getKey());
			}
		}
		return voterList; // Returns the voter list
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> voterMap = new HashMap<>();
		System.out.println("Enter the number of voters");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the id");
			int id = sc.nextInt(); // Gets the voter id from user
			System.out.println("Enter the age");
			int age = sc.nextInt(); // Gets the age from user
			voterMap.put(id, age); // Adding id and age into the map
		}
		ArrayList<Integer> voterList = voterList(voterMap);
		System.out.println("The eligible voters are");
		/**
		 * Printing the eligible voters id from the list
		 */
		for (int index : voterList) {
			System.out.println(index);
		}
		sc.close();

	}

}
