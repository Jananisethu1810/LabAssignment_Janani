/**
 * author : Janani S
 * Desc   :  Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos and CDs.) 
 */

package library;

public abstract class Item {
	/**
	 *  Attributes of abstract class
	 */
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	
	/**
	 * Abstract methods to implement in child classes for adding and printing details
	 */
	
	public abstract void addDetails();    
	public abstract void printDetails();
    
	/**
	 * Parameterized Constructor for initializing the class variables
	 * @param identificationNumber
	 * @param title
	 * @param numberOfCopies
	 */
	public Item(int identificationNumber, String title, int numberOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	
	/**
	 * Getters and setters for the class attributes
	 */
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getTitle() {
		return title;
		
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOCopies) {
		this.numberOfCopies = numberOCopies;
	}

}
