package sllTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sll.ILinkedList;
import sll.RunAllTests;
import sll.SinglyLinkedList;

public class TestInsertAtExceptionHandling {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestInsertAtExceptionHandling.class.getSimpleName();
		RunAllTests.outputResults(testsPassed, numberOfTests, className);
	} // oneTimeTearDown

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testInsertAtExceptionN01() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		numberOfTests++;
		try {
			list1.insertAtIndex(1, 7);
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
			testsPassed++;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN01

	@Test
	public void testInsertAtExceptionN02() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		numberOfTests++;	
		try {
			list1.insertAtIndex(-1, 46);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
			testsPassed++;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN02

	@Test
	public void testInsertAtExceptionN03() {
		ILinkedList list1 = new SinglyLinkedList();

		boolean exceptionThrown = false;
		numberOfTests++;	
		list1.insertAtIndex(0, 6);
		list1.insertAtIndex(0, 2);
		list1.insertAtIndex(0, 7);
		list1.insertAtIndex(0, 8);
		try {
			list1.insertAtIndex(6, 10);	
		} catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
			testsPassed++;
		} // end try-catch
		
		assertTrue(exceptionThrown);
	} // testInsertAtExceptionN03

} // end class TestInsertAtExceptionHandling
