import java.util.Scanner;

public class LabSeven {
	Scanner scnr = new Scanner(System.in);
	
	//these methods check that the user entered information in the correct parameters.
	//If they did not, the system will prompt them to re-enter information.
	//If information entered is in proper format, the program will display entered inputs entered.
	
	
	//this method checks to validate the user name  for specific # of alphanumeric characters
	public static String getName(Scanner scnr, String prompt) {
	 boolean isValid = true;
	 String name;
	 do {
		 System.out.println(prompt);
		 name = scnr.next();
		 if (name.matches("[A-Z]{1}[a-z]{1,29}")) { 
			// ^^ checking for specific # of alphanumeric characters from user
			 
			 isValid = false;
		 } else {
			 System.out.println("Please enter a valid name, with the first letter capitalized, "
			 		+ "and no more than 30 letters. ");
		 }
		 } while (isValid);
		 return name;
	 }
	 //this method checks for a specific # of alphanumeric characters from user to validate the user email 
	 public static String getEmail(Scanner scnr, String prompt) {
	 boolean isValid = true;
	 String email;
	 do {
	 System.out.println(prompt);
	 email = scnr.next();
	 if (email.matches("[A-Za-z0-9]{5,30}[@][A-Za-z]{5,10}\\.[A-Za-z0-9]{2,3}")) {
		 isValid = false;
	 } else {
		 System.out.println("Please enter a valid email in the proper format: blank@aol.com.");
	 }
	 } while (isValid);
	 return email;
	 }
	 //this method checks to validate if the user phone number has a certain # of alphanumeric characters
	public static String getNum(Scanner scnr, String prompt) {
		boolean isValid = true;
		String phnNum;
		do {
			System.out.println(prompt);
			phnNum = scnr.next();
			if (phnNum.matches("(\\d{3}-?\\d{3}-?\\d{4})$")) {
				isValid = false;
			} else {
				System.out.println("Please enter a valid phone number in the ###-###-#### format.");
			}
		} while (isValid);
		return phnNum;
	}
	//this method checks to validate if the date is in proper format, and user user correct quantity of numbers 
	public static String getDate(Scanner scnr, String prompt) {
		boolean isValid = true;
		String date;
		do {
			System.out.println(prompt);
			date = scnr.next();
			if (date.matches("[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{4}")) {
				isValid = false;
			} else {
				System.out.println("Please enter a valid date in the mm/dd/yyyy format.");
			}
		} while (isValid); 
		return date;
	}
}