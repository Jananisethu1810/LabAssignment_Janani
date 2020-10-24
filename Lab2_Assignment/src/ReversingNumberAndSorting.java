/**
 * Desc - A method that can accept an array of String objects and sort in alphabetical order.
 * @author Janani S
 *
 */
import java.util.*;
public class ReversingNumberAndSorting {
	public static int[] getSorted(int[] arr) {  //Return the resulting array after reversing the numbers and sorting it. 
		for(int itr=0;itr<arr.length;itr++) {
			int reverse=0;
			while(arr[itr]>0) {          // Reversing the numbers in the array
				int temp=arr[itr]%10;
				reverse=reverse*10+temp;
				arr[itr]=arr[itr]/10;
			}
			arr[itr]=reverse;
		}
		Arrays.sort(arr);          // Sorting the array after reversing the numbers
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size=scan.nextInt();
        int array[]=new int[size];  //Declaration and initialization of integer array
        System.out.println("Enter the elements in the array");
        for(int itr=0;itr<size;itr++) {
       	 array[itr]=scan.nextInt();
        }
        int sortedArray[]=getSorted(array);
        System.out.println("The sorted array is");
        for(int itr=0;itr<size;itr++) {
        	System.out.println(sortedArray[itr]);    // Printing the sorted array
        }
        scan.close();
	}

}
