/*
Assignment number :2.1
File Name : ClockAdvance.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class ClockAdvance{

	// Instructor comment: Bad indentation
	// Grade: 0.0
	public static void main(String[] args) {
/*first lets get the time that is given and divide it to hours and minutes*/
		
		// Instructor Comment: Missing spacing between operators and variables
		// Grade: 0.0
	int hour = (args[0].charAt(0)-'0')*10+((int)args[0].charAt(1)-'0');
	int min = (args[0].charAt(3)-'0')*10+((int)args[0].charAt(4)-'0');
/*now lets translate the minutes in to the amount of hours in it holds*/
	int hourAdd = Integer.parseInt(args[1])/60;
	int minAdd = Integer.parseInt(args[1])%60;
/*add hours to hours and minutes to minutes*/
	hour = hour+hourAdd;
	min = min+minAdd;
/*check if we past more then an hour*/
	
	// instructor comment: the "{" should be on the same line as the if condition
	// Grade: 0.0
	if (min>=60)
		{	
		hour++;
		min=min-60;
		}
/*check if we past a day or more*/
	// Instructor comment: missing "{}" after the if condition
	// Grade: 0.0
	if (hour>23)
		hour=hour%24;
/*check if we need to add zeros to the output*/
	if ((hour<10)&&(min<10))
		System.out.println("0" + hour + ":0" + min);
		else if (min<10)
			System.out.println(hour + ":0" + min);
			else if (hour<10)
				System.out.println("0" + hour + ":" + min);
				else 
					System.out.println(hour + ":" + min);
	
	}
}
/*done*/
