/**
 * @author Janani S
 * Desc  - A Java program that reads a line of integers and then displays each integer and the sum of all integers.
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class SumOfIntegers {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();        // Reads the line of integers.
		StringTokenizer tokens=new StringTokenizer(input);  // To break the string into tokens
		int sum=0, number=0;
		System.out.println("Entered digits are: ");
		while(tokens.hasMoreTokens()) {  // To display and add all integers
			 String str=tokens.nextToken();
			 System.out.println(str);
			 number=Integer.parseInt(str);
			 sum+=number;
		}
		System.out.println("The sum of all integers are "+sum);
		scan.close();
	}

}
