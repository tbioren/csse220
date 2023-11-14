package salesManager;

/**
 * TODO: Add class-level description here.
 * 
 *************************************************************************************** 
 * REQUIRED HELP CITATION
 * 
 * TODO: cite your help here or say "only used CSSE220 materials"
 * 
 * TODO: List the name and email address of your partner for the paired part, or
 * say "I worked on the paired part alone."
 *************************************************************************************** 
 */
public class Bundle {
	// TODO: Complete this class by adding fields, constructors, and methods here.
	// Adhere to (1), (2), and (3) below.
	
	// HINT: See the static methods `doubleToDollars` and `listToCommaSeparatedString` 
	// in SalesManager.java. Using these methods will save you time when formatting 
	// the sales report. 
	
	public Bundle() {} // Keep this constructor for unit tests
	
	public Bundle(String name) {
		// TODO Modify this constructor as needed.   
	}

	// (1) Requirements on Field Declaration Design/Engineering:
	// -- Fields of this class must be declared with the 'private' access modifier -
	// this provides compiler-enforced encapsulation
	// -- Getters/setters are not allowed for any field that is a collection, for
	// example, no getter or setter for an ArrayList field
	// This restriction keeps these complex internal data structures 'private',
	// i.e., encapsulated

	// (2) Requirements on New Method Design/Engineering:
	// Adhere to OOD Principle 4.a by creating 'tell' methods inside of Bundle.
	// That is, if your app needs something computed using the data stored in the
	// Bundle class,
	// then design/engineer the Bundle class so that it implements the computation
	// inside a new 'public' Bundle method.
	// Then a client can 'tell' Bundle to do that computation by calling this new
	// Bundle method.

	// (3) Requirements for Bundle's toString Method:
	// Implement a toString method that returns a String containing the values in
	// the object's fields
	// After adding fields to this class, use the Eclipse command: Source | Generate
	// toString
	// When debugging, call this toString method on Bundle objects from a
	// System.out.println command
	//
	// HINT: You may need to modify the toString method automatically generated by
	// Eclipse, both for Game and for Bundle (why?)
}