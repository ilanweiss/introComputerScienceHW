/*
Assignment number :3.4
File Name : Stats.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/
public class Stats {   	
	public static void main(String[] args)  {
		//anitilaize an array for our stats.
		int[] arr;
		arr=new int[args.length];
		int i = 0;
		int sum = 0;
		//put the integers in the array and calculat the total sum.
		while (i < args.length) {
			arr[i] = Integer.parseInt(args[i]);
			sum = sum + arr[i];
			i++;
		}		
		//calculat the avrage.
		double avr = sum / i;
		double absAvr = 0;
		//calculat the absolute deviation. 
		for (int j = 0 ; j < i ; j++){
			absAvr = absAvr + (Math.max(avr,arr[j]) - Math.min(avr,arr[j]));
		}
		absAvr = absAvr / i;
		//print the average and the absolute deviation.
		System.out.println("The average is "+ avr + 
		". The absolute deviation is " + absAvr + ".");
	}
}