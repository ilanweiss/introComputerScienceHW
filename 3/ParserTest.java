/** Tests the Parser class. */

public class ParserTest {   	
	public static void main(String[] args)  {
		Parser.init(args[0]);
		// Assumes that the input consists of a sequence of (char,n) pairs,
		// where n is 1 or more digits.
		while (Parser.hasMoreChars()) {
			System.out.println(Parser.nextChar());
			System.out.println(Parser.nextInt());
		}		
	}
}