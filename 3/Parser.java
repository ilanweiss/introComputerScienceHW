/*
Assignment number :3.1
File Name : Parser.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

/** A parser for texts consisting of characters and integers.
 *  The parser provides sequential access services to each char 
 *  and int in the text, as described in the methods API.  */

public class Parser {    
    static String str;   // the input text
	static int N;        // input size
	static int current;  // current position in the text
	
	/** Initializes the given string for parsing. */
	public static void init(String s) {
		str = s;
		N = str.length();
		current = 0;
	}
	
	/** Returns true if there are more characters to process, false otherwise. */
	public static boolean hasMoreChars() {
		return (current < N) ? true : false;
	}

	/** Returns the next character in the text.
	/*  Should be called only if hasMoreChars() is true. */
	// Side effect: advances current just beyond the character.
	public static char nextChar() {
		// go to nexts index and return the current character
		current++;
		return str.charAt(current-1);
	}
	
	/** Returns the next integer in the text.
	 *  Should be called only if hasMoreChars() is true.
	 *  It is assumed that this function is called only if the caller knows that
	 *  the next char in the string is the beginning of an integer. */
	// Side effect: advances current just beyond the integer.
	public static int nextInt() {
		// calculat the number and return it, go to next index.
		int num = 0;
		/**make sure the ascii value is a digit.
		 *make sure we dont pass the size of the given string.*/
		while ((Parser.hasMoreChars()) && ((str.charAt(current)) > 47) 
		&& ((str.charAt(current)) < 58)){
			num = num * 10 + (str.charAt(current) - 48);
			current++;
		}
		return num;
		}
}