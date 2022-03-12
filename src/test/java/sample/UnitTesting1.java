package sample;

import static org.junit.Assert.*;

import org.junit.Test;



public class UnitTesting1 { 
	
	/**
	 * steps
	 * =================================
	 * 1. taking vaid email sample
	 * 2. taking unvaid email sample
	 * 3.testing valid emails
	 * 4.testing unvalid emails
	 * ==================================
	 */
	
	
	/*
	 * 1. taking vaid email sample
	 */

	public String[] validemail = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com" };

	/*
	 * 2. taking unvaid email sample
	 */
	public String[] unvalidemail = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
			"..abc@abc.com", ".abc()@gmail.com", "abc@%.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
			"abc@gmail.com.aa.au" };

	/*
	 * 3.testing valid emails
	 */

	@Test
	public void test1() {
		for (int i = 0; i < validemail.length; i++) {
			String checker1 = validemail[i];

			Boolean email = Validation1.email(checker1);
			assertEquals(true, email);
		}
	}

	/*
	 * 4.testing unvalid emails
	 */

	@Test
	public void test2() {
		for (int i = 0; i < unvalidemail.length; i++) {
			String checker2 = unvalidemail[i];

			Boolean email = Validation1.email(checker2);
			assertEquals(false, email);
		}
	}
}