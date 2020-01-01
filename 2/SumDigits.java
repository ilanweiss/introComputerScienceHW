/*
Assignment number :2.2
File Name : SumDigits.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class SumDigits{

	public static void main(String[] args) {
/*first lets get the number given */
	int number = Integer.parseInt(args[0]);
	int sum = 0;
/*now lets sum its digits */
	while (number>0){
		sum = sum + number%10;
		number = number/10;
		}
	System.out.println(sum);
	}
}
/*done*/