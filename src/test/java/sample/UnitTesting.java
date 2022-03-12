package sample;

import static org.junit.Assert.*;

import org.junit.Test;



public class UnitTesting { 
	
	/**
	 * Testing all methods by making object 
	 *   and comparing with respective pattern
	 * 
	 */
	@Test
	public void firstname() {
		Validation test = new Validation();
		Boolean fn = test.firstname("Shardul");
		assertEquals(true, fn);
	}
	@Test
	public void lastname() {
		Validation test1 = new Validation();
		Boolean lastname = test1.lastname("Kumbhar");
		assertEquals(true, lastname);
	}
	@Test
	public void email() {
		Validation test2 = new Validation();
		Boolean email = test2.email("abcde53@bl.co.in");
		assertEquals(true, email);
	}
	@Test
	public void Number() {
		Validation test3 = new Validation();
		Boolean phone = test3.number("91 5689423684");
		assertEquals(true, phone);
	}
	@Test
	public void password() {
		Validation test4 = new Validation();
		Boolean output = test4.password("abc@yahoo.com");
		assertEquals(true, output);
	}
}