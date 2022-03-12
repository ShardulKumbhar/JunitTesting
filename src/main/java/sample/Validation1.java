package sample;

public class Validation1 {

	/*
	 * 1.creating method to check email pattern
	 */
	public static boolean email(String mail) {
		return mail.matches("^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
	}
}
