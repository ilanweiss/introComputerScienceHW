/*
Assignment number :1.4
File Name : Order.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class Order {

	public static void main(String[] args){
		// Instructor Comment: Few things:
		// 1. You should take the exercises more seriously.
		// 2. when commenting a single line use '//'
		// 3. please only use comments if  informative
		// 4. although entertaining this is not the place for such comments.
		// Grade: -4.0
        /*casting.............................*/
		int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		/*find what is smaller................*/
		int min = Math.min(num1,num2);
		int mid = Math.max(num1,num2);
		/* declare max, will be used shortly..*/
		int max;
		/* are we done yet?...................*/
		if (num3>mid){
             max = num3;
        }
        else
        /*shit, i guess not...................*/
        {
            if (num3<min){
            /*change evrything we have a min..*/
                max=mid;
                mid=min;
                min=num3;
                }
            else
            /*ok so it was the mid all along...*/
            {
                max=mid;
                mid=num3;
            }
        }
        /*print somthing so the TA sees it works*/
		System.out.println(min + " " + mid + " " + max);
	}
}
/*done with assignment 1, so long and thanks for all the fish*/
