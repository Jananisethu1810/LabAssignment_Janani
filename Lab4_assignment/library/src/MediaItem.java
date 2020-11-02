/**
 * author : Janani S
 * Desc   :  Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos and CDs.) 
 */

package library;
import java.util.*;
public abstract class MediaItem extends Item {
	
	/**
	 * Defining an explicit parameterized constructor for the super class constructor.
	 */
	
    public MediaItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		
	}
    Scanner sc=new Scanner(System.in);
    
    /**
	 *  Attribute of mediaItem class
	 */
    
	private int runtime;
	
	/**
	 * Getters and setters for the class attributes
	 */
	
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	/**
	 * Overriding the abstract method to get details from the user
	 */
	
	@Override
	public void addDetails() {
		System.out.println("Enter the identification number");
		int idNum=sc.nextInt();
		setIdentificationNumber(idNum);
		System.out.println("Enter the title");
		String title=sc.next();
		setTitle(title);
		System.out.println("Enter the number of copies");
		int numOfCopies=sc.nextInt();
		setNumberOfCopies(numOfCopies);
		System.out.println("Enter the runtime");
		this.runtime=sc.nextInt();
	}
	
	/**
	 * Overriding the abstract method to display user given inputs
	 */
	
	@Override
	public void printDetails() {
		System.out.println("Identification Number : "+getIdentificationNumber());
		System.out.println("Title : "+getTitle());
		System.out.println("Number of copies : "+getNumberOfCopies());
		System.out.println("Runtime : "+getRuntime());
	}
    
}
