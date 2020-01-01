/*
Assignment number :3.2
File Name : Expand.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class Expand {   	
	public static void main(String[] args)  {
		//get the given string.
		Parser.init(args[0]);
		//create a new string.
		String newStr = "" ;
		//while we have more chareters do this
		while (Parser.hasMoreChars()) {
			char theChar = Parser.nextChar();
			int theAmount = Parser.nextInt();
			/* build our new string.
			 *take the cutrrent chareter and put in the new string.
			 *do this the amount of time of our current digit.*/
			for (int i=0;i<theAmount;i++){
				newStr=newStr+theChar;
			}		
		}
	//print the string 
	System.out.println(newStr);	
	}
}