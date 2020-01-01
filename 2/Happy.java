/*
Assignment number :2.3
File Name : Happy.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class Happy{

	public static void main(String[] args) {
/* first lets get the number given and generate the string that we will print*/
	int number = Integer.parseInt(args[0]);
	String print = " is happy, as follows:\n";
	int i = 0;
	int digitSum=0;
/* now lets check happiness of the number */
	while ((number != 1) && ( i<100 )){
		while (number>0){
/* add up the squred digits */
			digitSum = digitSum + (number%10)*(number%10);
			number=number/10;
		}
/* add the stage to the print and restart variables for next interaction*/
		print = print + digitSum + " ";
		number= digitSum;
		digitSum=0;
		i++;
		}
/* make sure last interaction didn;t make a happy number and print results happy or not*/
		if (( i == 100 ) && (digitSum!=1))
			System.out.println(args[0] + " isunhappy :(");
			else
				System.out.println(args[0] + print + "\b");
	}
}
/*done*/