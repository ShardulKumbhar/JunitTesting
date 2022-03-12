package sample;

public class Validation {
	/**
	 * Steps
	 * =========================================
	 * 1.Method for first name pattern
	 * 2.method for last name pattern
	 * 3. method for email pattern
	 * 4.method for phone numbher pattern
	 * 5.method for password pattern
	 * ==========================================
	 */
	
	/*
	 * 1.Method for first name pattern
	 */
	public static boolean firstname(String firstname) {
		return firstname.matches("[A-Z][a-z]*");
	}

	/*
	 * 2.method for last name pattern
	 */
	public static boolean lastname(String lastname) {
		return lastname.matches("[A-Z]{1}[a-z]{3,}");
	}

	/*
	 * 3. method for email pattern
	 */
	public static boolean email(String mail) {
		return mail.matches("([a-z]+[0-9]+@bl[.]co[.]in)*");
	}

	/*
	 * 4.method for phone numbher pattern
	 */
	public static boolean number(String phone) {
		return phone.matches("^([0-9]{2}\\s[0-9]{10})$");
	}

	/*
	 * 5.method for password pattern
	 */

	public static boolean password(String password) {
		return password.matches("^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
	}
}
