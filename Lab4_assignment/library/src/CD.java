/**
 * author : Janani S
 * Desc   :  Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos and CDs.) 
 */

package library;
import java.util.*;
public class CD extends MediaItem{
	/**
	 * Defining an explicit parameterized constructor for the super class constructor.
	 */
	
	public CD(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}
	Scanner sc=new Scanner(System.in);
	
	/**
	 *  Attributes of CD class
	 */
	
	private String artist;
	private String genre;
	
	/**
	 * Getters and setters for the class attributes
	 */
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/**
     *  Overriding the method of its super class mediaItem to get user input.
     *  Adding additional information into the overridden method.
     */
	
	@Override
	public void addDetails() {
		super.addDetails();
		System.out.println("Enter the artist name");
		this.artist=sc.next();
		System.out.println("Enter the genre");
		this.genre=sc.next();
	}
	
	/**
	 * Overriding the abstract method to display user given inputs
	 */
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Artist : "+getArtist());
		System.out.println("Genre : "+getGenre());
	}
	
	
	

}
