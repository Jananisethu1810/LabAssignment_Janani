/**
 * Desc - Calculate the sum of first n natural numbers which are divisible by 3 or 5.
 * @author Janani S
 *
 */
import java.util.*;
public class SumCalculation {
    public static int calculateSum(int num) {
    	int sum=0;
    	for(int itr=1;itr<=num;itr++) {
    		if(itr%3==0 || itr%5==0) {
    			sum=sum+itr;
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int sum=calculateSum(num);
        System.out.println("The sum is "+sum);
	}

}
