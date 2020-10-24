/**
 * Desc - A method which accepts an array of integer elements and return the second smallest element in the array.
 * @author Janani S
 *
 */
import java.util.*;
public class SecondSmallestElement {
	public static int getSecondSmallest(int arr[]) {  //Get the second smallest element in the array
		Arrays.sort(arr);   //Sorting the array in ascending order
		return arr[1];
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
         int secondSmallest=getSecondSmallest(array);  
         System.out.println("The second smallest element is "+secondSmallest);   // Printing the second smallest number
         scan.close();
	}

}
