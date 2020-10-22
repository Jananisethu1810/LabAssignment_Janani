/**
 * Desc - Program to simulate a traffic light
 * @author Soft
 *
 */
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Select the traffic light");
        System.out.println("1.Red");
        System.out.println("2.Yellow");
        System.out.println("3.Green");
        String message=scan.next();
        if(message.equalsIgnoreCase("red")) {
        	System.out.print("stop");
        }
        else if(message.equalsIgnoreCase("Yellow")) {
        	System.out.print("ready");
        }
        else if(message.equalsIgnoreCase("Green")) {
        	System.out.print("go");
        }
	}

}
