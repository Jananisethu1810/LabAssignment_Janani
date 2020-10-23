/**
 * Desc - Recursive and non-recursive functions to print the nth value of the Fibonacci sequence.
 * @author Janani S
 *
 */
import java.util.*;
public class FibonacciRecursiveNonRecursive {
public static int recursiveFibonacci(int num) {
	if(num<=1) {
		return num;
	}
	return recursiveFibonacci(num-1)+recursiveFibonacci(num-2);
}
public static int nonRecursiveFibonacci(int num) {
	if(num <= 1){
	   return num;
	}
        int fiboCurr = 1;
        int fiboPrev = 1;
	for(int i = 2; i < num; ++i){
	int temp = fiboCurr;
	fiboCurr += fiboPrev;
	fiboPrev = temp;
	}
	return fiboCurr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number =scan.nextInt();
        int result1=recursiveFibonacci(number);
        System.out.println("Recursive Fibonacci is "+result1);
        int result2=nonRecursiveFibonacci(number);
        System.out.println("Non Recursive Fibonacci is "+result2);
	}
      
}
