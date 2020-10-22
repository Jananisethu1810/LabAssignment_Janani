/**
 * Desc - Prints the prime up to the given integer.
 * @author Janani S
 *
 */
import java.util.Scanner;
public class PrimeNumber {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        System.out.println(2);
        for(int itr=2;itr<=number;itr++) {
        	int flag=0;
        	for(int index=2;index<=itr/2;index++) {
        		if(itr%index==0) {
        			flag=1;
        			break;
        		}
        }
        if(flag==0) {
            System.out.println(itr+" ");
            }
	}

}
}
