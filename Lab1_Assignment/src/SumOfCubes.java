
/**
 * Desc - Find the sum of the cubes of the digits.
 * @author Janani S
 *
 */
import java.util.Scanner;
public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
        int number=scan.nextInt();
        int sum=0;
        while(number>0) {
        	int mod=number%10;
        	int cube=mod*mod*mod;   //calculating cube of each digit
        	sum=sum+cube;     // calculating sum of the cubes
        	number=number/10;
        }
        System.out.print("The sum of cubes of the digits is "+sum);
        
	}

}
