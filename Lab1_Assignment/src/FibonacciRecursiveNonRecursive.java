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
	int num1 = 0, num2 = 1, res=0;
	for(int itr=0;itr<10;itr++) {
		res=num1;
		int sum = num1+num2;
		num1 = num2;
		num2 = sum;
	}
	return res;
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
