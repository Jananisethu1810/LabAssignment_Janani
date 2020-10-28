/**
 * Desc  - A java program that displays the number of characters, lines and words in a text
 * @author Janani S
 *
 */
import java.util.Scanner;
public class DisplayString {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Enter the input text : ");
        String inputStr=scan.nextLine();
        int numberOfCharacters, numberOfLines, numberOfWords;
        String[] word=inputStr.split(" ");
        numberOfWords=word.length;          //Calculates the number of words
        String[] stringArr=inputStr.split("\n");
        numberOfLines=stringArr.length;           //Calculates the number of lines
        char[] charArr=inputStr.toCharArray();
        numberOfCharacters=charArr.length;        //Calculates the number of characters
        //Printing the number of characters, lines and words in a text.
        System.out.println("The number of characters in the given text is "+numberOfCharacters);
        System.out.println("The number of words in the given text is "+numberOfWords);
        System.out.println("The number of lines in the given text is "+numberOfLines);
        scan.close();

    }

}
