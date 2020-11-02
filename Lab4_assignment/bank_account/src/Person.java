package bank_account;

public class Person {
	private String name;
	private float age;

	/**
	 * Parameterized Constructor
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * Getters and setters for the account element
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

}
