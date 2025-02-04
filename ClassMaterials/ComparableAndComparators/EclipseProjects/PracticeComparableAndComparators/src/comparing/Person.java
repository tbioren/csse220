package comparing;


/**
 * A Person class, designed for use with comparable.
 * 
 * TODO #2: Modify this class so that it implements Comparable<Person>
 * 
 * People objects should be sorted in non-decreasing order by
 *  1) their last name
 *  2) their age, but only if the 2 People objects being compared have the same last name
 * 
 * So the output of the driver main should be:
 *  [(Anders, 45), (Li, 19), (Li, 22), (Smith, 18), (Smith, 20)]
 * 
 * @author CSSE Faculty
 *
 */
public class Person {	
	private String lastName;
	private int age;
	
	public Person(String lastName, int age) {
		this.lastName = lastName;
		this.age = age;
	} // Person
	
	public String toString() {
		return "("+ this.lastName + ", " + age + ")";
	} // toString
	
}
