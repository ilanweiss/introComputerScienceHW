/*
Assignment number :1.2
File Name : SinFunction.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class SinFunction {

	public static void main (String[]args){
        /*prety strghit fowared prints all sins that were asked for*/
        double zero = Math.sin(0);
		System.out.println("sin(0)\t\t= " + zero);
        double piedArg = Math.PI*(0.25);
        double quarters = Math.sin(piedArg) ;
		System.out.println("sin(1/4 PI)\t= " + quarters) ;
        piedArg= Math.PI*(0.5);
        double halfs = Math.sin(piedArg);
		System.out.println("sin(1/2 PI)\t= " + halfs) ;
		System.out.println("sin(3/4 PI)\t= " + quarters) ;
        System.out.println("sin(PI)\t\t= " + zero) ;
        System.out.println("sin(5/4 PI)\t= " + (-1*quarters));
        System.out.println("sin(3/2 PI)\t= " + (-1*halfs)) ;
        System.out.println("sin(7/4 PI)\t= " + (-1*quarters));
		System.out.println("sin(2 PI)\t= " + zero) ;
	}
}
