import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public static int[] modifyArray(int[] arr) { //Remove the duplicate elements in the array and sort it in descending order 
		int len=arr.length;
		int[] tempArray = new int[len];  
        int index = 0, count=0;  
        for (int itr=0; itr<len-1; itr++){  
            if (arr[itr] != arr[itr+1]){  
                tempArray[index++] = arr[itr];  
            } 
            else{
            	count++;
            }
         }  
        tempArray[index++] = arr[len-1];   
        Arrays.sort(tempArray);            // Sorting the temporary array
        int result[]=new int[len-count];  // Creation of new array
        int j=0;
        for(int i=len-1;i>=0;i--) {  // Adding elements into the new array in descending order.
        	if(tempArray[i]<=0) {
        		continue;
        	}
        	else
        		result[j++]=tempArray[i];
        }
              
        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size=scan.nextInt();
        int inputArray[]=new int[size];  //Declaration and initialization of integer array
        System.out.println("Enter the elements in the array");
        for(int itr=0;itr<size;itr++) {
        	inputArray[itr]=scan.nextInt();
        }
        int resultantArray[]=modifyArray(inputArray);
        System.out.println("The sorted array is");
        for(int itr=0;itr<resultantArray.length;itr++) {
        	System.out.println(resultantArray[itr]);    // Printing array elements in descending order
        }
        scan.close();
	}

}
