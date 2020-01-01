/*
Assignment number :1.1
File Name : Popsicles.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class Popsicles {

	public static void main(String[] args) {
	// Instructor Comment: If there is nothing to say on this program then you shouldn't comment 
	// Grade: -2.0
	/* nothing to say about this program, it gets name and amount from user and tells him how much he needs to pay*/

		// Instructor Comment: Rows should not be longer than 80 characters long. (including tabs and spaces).
		// Grade: -2.0
		Double cost=(Double.parseDouble(args[1])*2.5);
		System.out.println(args[0] + ", " + args[1] + " popsicles will cost you " + cost + " Shekels. Bon appetit.");
	}

}
