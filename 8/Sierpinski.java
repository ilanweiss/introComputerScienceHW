/*
*Assignment number :8.4
*File Name : Sierpinski.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/

public class Sierpinski {

	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	/**
	 * draws first triangle and calls auxiliary method 
	 * to divide the triangle n times.
	 * @param n
	 */
	public static void sierpinski(int n){
		StdDraw.line(0, 0, 1, 0);
		StdDraw.line(0, 0, 0.5,Math.sqrt(3)/2);
		StdDraw.line(0.5,Math.sqrt(3)/2,1,0);
		auxiliary(0,0,1,0,0.5,Math.sqrt(3)/2,n-1);
		}
	/**
	 * gets 3 points (x1,y1) (x2,y2) & (x3,y3) and an integer n
	 * makes an upside down triangle dividing the existing
	 * triangle to 4 n times.
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @param n
	 */
	public static void auxiliary(double x1,double y1,
			double x2,double y2, double x3, double y3, int n)
	{
		if (n==0) 
			return;
		StdDraw.line((x1+x2)/2, (y1+y2)/2, (x2+x3)/2, (y2+y3)/2);
		StdDraw.line((x2+x3)/2, (y2+y3)/2, (x1+x3)/2, (y1+y3)/2);
		StdDraw.line((x1+x3)/2, (y1+y3)/2, (x2+x1)/2, (y2+y1)/2);
		auxiliary(x1 , y1, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2, n-1);
		auxiliary((x1+x2)/2, (y1+y2)/2 , x2, y2, (x2+x3)/2, (y2+y3)/2, n-1);
		auxiliary((x1+x3)/2, (y1+y3)/2,(x2+x3)/2, (y2+y3)/2, x3, y3 , n-1);	
	}
}
