/**
 * Desc - To check if a number is a power of two or not
 * @author Janani S
 *
 */
import java.util.*;
public class PowerOfTwo {

	public static boolean checkNumber(int num) {
		while(num>1) {
			if(num%2!=0) {
				return false;
			}
			num=num/2;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        if(checkNumber(number)) {
        	System.out.print(number+" is a power of 2");
        }
        else
        	System.out.print(number+" is not a power of 2");
	}

}
