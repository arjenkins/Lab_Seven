import java.util.Scanner;
public class LabSevenValidator {

	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			
			//This program is used with the LabSeven.java file to display user input if it is 
			//entered in the correct parameters. If entered properly, console will display
			//the name, email address, phone number and date the user enterd.
			
			String name = LabSeven.getName(scnr, "Please enter a valid name: ");
			String email = LabSeven.getEmail(scnr, "Please enter a vaild email address: ");
			String phnNum = LabSeven.getNum(scnr, "Please enter a valid phone number: ");
			String date = LabSeven.getDate(scnr, "Please enter a valid date: ");
			
			System.out.println("Name: " + name);
			System.out.println("Email: " + email);
			System.out.println("Phone number: " + phnNum);
			System.out.println("Date: "  + date);

			scnr.close();

	}

}
