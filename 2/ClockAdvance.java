/*
Assignment number :2.1
File Name : ClockAdvance.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class ClockAdvance{

	public static void main(String[] args) {
/*first lets get the time that is given and divide it to hours and minutes*/
	int hour = (args[0].charAt(0)-'0')*10+((int)args[0].charAt(1)-'0');
	int min = (args[0].charAt(3)-'0')*10+((int)args[0].charAt(4)-'0');
/*now lets translate the minutes in to the amount of hours in it holds*/
	int hourAdd = Integer.parseInt(args[1])/60;
	int minAdd = Integer.parseInt(args[1])%60;
/*add hours to hours and minutes to minutes*/
	hour = hour+hourAdd;
	min = min+minAdd;
/*check if we past more then an hour*/
	if (min>=60)
		{	
		hour++;
		min=min-60;
		}
/*check if we past a day or more*/
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
