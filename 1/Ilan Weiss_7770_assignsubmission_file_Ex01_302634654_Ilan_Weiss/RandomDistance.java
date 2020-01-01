/*
Assignment number :1.3
File Name : RandomDistance.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class RandomDistance {

	public static void main(String[] args) {
        /* casting to int.......................*/
        int	a = Integer.parseInt(args[0]);
        int	b = Integer.parseInt(args[1]);
        /* randomizing first point (x1,y1)......*/
        int x1 = (int) (Math.random()*(b-a)+ a);
        int y1 = (int) (Math.random()*(b-a)+ a);
        /*randomazing secound point(x2,y2)......*/
        int x2 = (int) (Math.random()*(b-a)+ a);
        int y2 = (int) (Math.random()*(b-a)+ a);
        /*calculting distance...................*/
        double D= (Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))));
        /*printing..............................*/
     // Instructor Comment: you should use spaces between variables. i.e x1 + x2.
     // Grade: -2.0
        System.out.println("The?distance?between ("+x1+", "+y1+") and ("+x2+", "+y2+") is " + D);
	}

}
