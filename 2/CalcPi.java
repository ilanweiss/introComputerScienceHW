/*
Assignment number :2.5
File Name : CalcPi.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/
public class CalcPi{

	public static void main(String[] args) {
	/* lets get the number of interactions */
		long N = Integer.parseInt(args[0]);
		double cir = 0;
	/* get a random point inside square N times*/
		for (long i = 0; i < N; i++){
			double x	=	2 * Math.random() - 1;				
			double y	=	2 * Math.random() - 1;
	/*check if inside circle*/
			if (x*x+y*y<1)
				cir++;
		}
	/*  R^2pi = Scir (area of a circle) 
		4*R^2= Ssqr (area square that traps the circle)=N (all points are in the square)
		dividing equation gives: pi=4*Scir/square */
		double pai= 4*(cir/N);
		System.out.println(pai);
	}

}
