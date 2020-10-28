/**
 * Desc  - To check whether the given string is a positive string.
 * @author Soft
 *
 */
import java.util.Scanner;
public class PositiveString { 
	public static boolean checkPositiveString(String str) {    // A method that accepts a String and checks if it is a positive string
            int length=str.length();
	    for(int outerIndex=0;outerIndex<length;outerIndex++) {
		char ch=str.charAt(outerIndex);
		for(int innerIndex=outerIndex+1;innerIndex<length;innerIndex++) {
		    if(ch<str.charAt(innerIndex)) {
		       continue;
		    }
		    else
		    return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
            System.out.println("Enter the input string : ");
            String inputStr=scan.next();
            boolean result=checkPositiveString(inputStr);       //Function Call
            System.out.println(result);
            scan.close();
	}

}
