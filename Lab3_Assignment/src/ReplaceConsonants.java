/**
 * Desc  - Replace all the consonants in the String with the next alphabet. 
 * @author Janani S
 *
 */
import java.util.Scanner;
public class ReplaceConsonants {
	public static String alterString(String inputStr) { // To return the String replacing all the consonants with the next character.
		String str="";
		for(int itr=0;itr<inputStr.length();itr++) {
        	char temp=inputStr.charAt(itr);
        	if(temp=='a' || temp=='A' || temp=='e' || 
        			temp=='E' || temp=='i' || temp=='I' || 
        			temp=='o' || temp=='O' || temp=='u' || 
        			temp=='U') {
        		 str+=temp;
        		
        	}
        	else {
        		str+=(char)(temp+1);        //Replace consonants 
        	}
        }
		return str;     
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the input string :");
        String inputStr=scan.next();
        System.out.print("The output string is ");
        String outputStr=alterString(inputStr);
        System.out.println(outputStr);
        scan.close();
	}

	
}
