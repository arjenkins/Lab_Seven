import java.util.Scanner;
import java.util.regex.*;

public class LabSeven {
	Scanner scnr = new Scanner(System.in);
//this code does not run :(
	
	
	public static String getName(Scanner scnr, String prompt) {
	 boolean isValid = false;
	 String name;
	 do {
		 System.out.println(prompt);
		 name = scnr.next();
		 if (name.matches("([A-Z]{1}[a-z]{29}")) {
			 isValid = true;
		 } else {
			 System.out.println("Please enter a valid name, with the first letter capitalized, "
			 		+ "and no more than 30 letters. ");
		 } while (isValid);
		 return name;
	 }
	 
	 public static String getEmail(Scanner scnr, String prompt);
	 boolean isValid1 = false;
	 String email;
	 System.out.println(prompt);
	 email = getEmail(scnr, prompt);
	 if (email.matches("[A-Za-z0-9]{5,10}[^@]\\.[0-9]{2,3}")) {
		 isValid1 = true;
	 } else {
		 System.out.println("Please enter a valid email in the proper format: blank@aol.com.");
	 } while (isValid1);
	 return email;
	 }

	private static String getEmail(Scanner scnr1, String prompt1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getNum(Scanner scnr, String prompt) {
		boolean isValid = false;
		String phnNum;
		do {
			System.out.println(prompt);
			phnNum = getNum(scnr, prompt);
			if (phnNum.matches("(\\d{3}-?\\d{3}-?\\d{4})$")) {
				isValid = true;
			} else {
				System.out.println("Please enter a valid phone number in the ###-###-#### format.");
			}
		} while (isValid);
		return phnNum;
	}

	public static String getDate(Scanner scnr, String prompt) {
		boolean isValid = false;
		String date;
		do {
			System.out.println(prompt);
			date = getDate(scnr, prompt);
			if (date.matches("([0-9]{2}[\\/](0-9]{2}[\\/][0-9])")) {
				isValid = true;
			} else {
				System.out.println("Please enter a valid date in the mm/dd/yyyy format.");
			}
		} while (isValid);
		return date;
	}
}