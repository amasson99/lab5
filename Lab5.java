/*******************************************************************
* Lab5.java
* <Alex Masson / Section B/ Thursday 4:30 - 6:30>
*
* This is a password verifier that encrypts the password and writes to a file.
*******************************************************************/


import java.io.*;		// need for File I/O
import java.util.*;

public class Lab5 {
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Valid passwords include a minimum of 8 characters that");
		System.out.println("includes at least one digit and at least one of the following");
		System.out.println("special characters: ! @ # $ *");
		String password;


// Write code to validate password here
while(true){
	boolean special = false;
	boolean number = false;
	System.out.print("\nPlease enter a Password: ");
	password = s.nextLine();

	if (password.length() < 8){
	System.out.println("Invalid password – must be at least 8 characters");
	} else {//end if
		for (int i = 0; i < password.length(); i++){
			char c = password.charAt(i);
				if (Character.isDigit(c)) {
                number = true;
            }
				if (c>=33&&c<=46||c==64){
							special = true;
						}
					}//end for

				if (special == true && number == true){

					break;

				}//end break
				if (special = false){
					System.out.println("Invalid password – must contain at least one of the following characters: ! @ # $ *");
				}//end break

				if (number = false){
					System.out.println("Invalid password – must contain at least one digit");
				}//end break
}
}//end else
// Write code here to verify same matching password
	System.out.print("Re-enter password: ");
	String passwordConfirm = s.nextLine();

	if (password.equals(passwordConfirm)){

		System.out.println("Password Confirmed");

	} else {
		System.out.println("Password Not Confirmed");

	}

// Encrypt/Write PW to text file here using StringBuilder
		PrintWriter output = new PrintWriter ("Lab5.txt");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < password.length(); i++){
			char c = password.charAt(i);
			int ascii = (int) c;
			sb.append(ascii);
			sb.append(",");
		}
		sb.append("0");
		String line = sb.toString();
		System.out.print(line);
		output.print(line + "\n");
//outFile.println(sb.toString());
// Output WID and Test Scores to the Textfile
output.println("87656786 98");
output.println("89273641 67");
output.println("82839485 78");
output.println("89127364 87");
output.println("84567456 78");
output.println("87456767 99");



// Close the output file
output.close();

// -----------------------------------------------------------------------
// Extra Credit - read in from the file and determine AVG and High Score

//	Read in filename and verify file exists


//	Read in password and decrypt


//	Verify user knows the password


// Total all the scores and check for high score, display WID and score



  } // end main
} // end class
