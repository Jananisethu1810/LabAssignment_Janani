
/**
 * Desc  - Accept a number and modify it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number.  
 * @author Janani S
 *
 */
import java.util.Scanner;
public class NumberModification {
 	
    public static int  modifyNumber(int num) { //Accepts a number and modify it.
    	String str=""+num;
    	int size=str.length();
    	String result="";
    	for(int index=0;index<size-1;index++) {
    		char ch1=str.charAt(index), ch2=str.charAt(index+1);
    		int temp=Math.abs(Integer.parseInt(ch1+"")-Integer.parseInt(ch2+""));
    		result+=temp;
    	}
    	result+=str.charAt(size-1);           // Adding the unit digit into the string.
    	return Integer.parseInt(result);
    }
    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number to be modifed :");
	int number=scan.nextInt();
	int result=modifyNumber(number);                 //Function Call
	System.out.println("The modified number is "+result);
        scan.close();
	}

}
