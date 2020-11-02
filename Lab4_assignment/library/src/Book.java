/**
 * author : Janani S
 * Desc   :  Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos and CDs.) 
 */

package library;

public class Book extends writtenItem{

	/**
	 * Defining an explicit parameterized constructor for the super class constructor
	 */
	
	public Book(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	
    /**
     * Overriding the methods of its super class writtenItem
     */
	
	@Override
	public void addDetails() {
		super.addDetails();	
	}

	@Override
	public void printDetails() {
		super.printDetails();
		
	}

     
}
