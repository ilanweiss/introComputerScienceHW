/*
Assignment number :3.3
File Name : Eval.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class Eval {   	
	public static void main(String[] args)  {
		//get the given string.
		Parser.init(args[0]);
		//start the calculation with the first number.
		int sum = Parser.nextInt();
		//while we have more chareters do this.
		while (Parser.hasMoreChars()) {
			char theChar = Parser.nextChar();
			//check the operator and choose what to do.
			switch (theChar){
				case  '+' :	sum = sum + Parser.nextInt();
								break;
				case  '-' :	sum = sum - Parser.nextInt();
								break;
			}		
		}
	//print the eqution with the result.	
	System.out.println(Parser.str + " = " + sum);	
	}
}