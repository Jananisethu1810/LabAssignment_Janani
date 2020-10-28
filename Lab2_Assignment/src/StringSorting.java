/**
 * Desc - A method that can accept an array of String objects and sort in alphabetical order.
 * @author Janani S
 *
 */
import java.util.*;
public class StringSorting {
	public static String[] sortStrings(String[] str) {  // Accept an array of String objects and sort in Alphabetical order.
	    int len=str.length;
	    Arrays.sort(str);    //Sorting the array in ascending order
	    if(len%2==0) {
	        for(int i=0,j=len/2;i<len/2;i++,j++) {  
	    	    str[i]=str[i].toUpperCase();  
	    	    str[j]=str[j].toLowerCase();
	        }
	    }
	    else {
	    	for(int i=0;i<len/2+1;i++) {           //changing left half array elements in upper case
	    		str[i]=str[i].toUpperCase();
	    	}
	    	for(int j=len/2+1;j<len;j++) {         //changing right half array elements in lower case
	    		str[j]=str[j].toLowerCase();
	    	}
	    }
	    return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int size =scan.nextInt();
        String stringArr[]=new String[size];    //Declaration and initialization of string array
        System.out.println("Enter the string");
        for(int itr=0;itr<size;itr++) {
        	stringArr[itr]=scan.next().toLowerCase();
        }
        String[] sortedArray=sortStrings(stringArr);
        System.out.println("The sorted string array is");
        for(int itr=0;itr<size;itr++) {
        	System.out.println(sortedArray[itr]);    // Printing the sorted array
        }
        scan.close();
	}

}
