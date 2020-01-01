package week3codes;

public class StringDemo {

	public static void main(String args[]) {
		// slice example
		String str = "It was the best of time";	
		System.out.println(slice(str,0,5));
		System.out.println(slice(str,7,14));
		System.out.println(slice(str,0,10) + "worst" + slice(str,15,22));

		// upCase example
		System.out.println(upCase("Adding 2 and 3 is as easy as ABC"));
	}

	// Returns a string consisting of the characters from index from​
	// to index to in the given string (similar to substring).​
	public static String slice(String str, int from, int to) {
		if ((from < 0) || (to >= str.length()) || (from > to)) {
			return "";
		}
		String result = "";
		for (int i = from; i <= to; i++) {
			result = result + str.charAt(i);
		}
		return result;
	}

	// Returns a string consisting of the original string,​
	// with all the alphabetic characters in upper case. ​
	public static String upCase(String str) {
		String result = "";
		char c;
		for (int i = 0; i < str.length(); i++) { 
			c = str.charAt(i);
			if ((c > 96) && (c < 123)) {
				c = (char) (c - 32);
			}
			result = result + c;
		}
		return result;
	}
}
