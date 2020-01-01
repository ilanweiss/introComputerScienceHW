/*
*Assignment number :8.5
*File Name : Banach.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/

public class Banach {

	public static void main(String[] args) {
		banach(Integer.parseInt(args[0]));
	}
	/**
	 * gets an integer and calls upon method to draw 
	 * circles creating Banach curve.
	 * @param n
	 */
	public static void banach(int n){
		auxCircle(0.5, 0.5, 0.37, n);
	}
	/**
	 * recursive method that draws 9 circles with a radios of r/3
	 *  on a big circle of radios r, 8 on the rim, 1 in the center.
	 * does this to each circle n times creating the curve.
	 * @param x
	 * @param y
	 * @param r
	 * @param n
	 */
	public static void auxCircle(double x,double y,double r, int n){
		if ( n== 0) {
			return;
		}
		StdDraw.circle(x , y ,r);
		auxCircle(x, y,r/3,n-1);
		auxCircle(x+r*Math.cos(Math.PI/4), y+r*Math.sin(Math.PI/4),r/3,n-1);
		auxCircle(x+r*Math.cos(2*Math.PI/4), y+r*Math.sin(2*Math.PI/4),r/3,n-1);
		auxCircle(x+r*Math.cos(3*Math.PI/4), y+r*Math.sin(3*Math.PI/4),r/3,n-1);
		auxCircle(x+r*Math.cos(4*Math.PI/4), y+r*Math.sin(4*Math.PI/4),r/3,n-1);
		auxCircle(x+r*Math.cos(5*Math.PI/4), y+r*Math.sin(5*Math.PI/4),r/3,n-1);
		auxCircle(x+r*Math.cos(6*Math.PI/4), y+r*Math.sin(6*Math.PI/4),r/3,n-1);
		auxCircle(x+r*Math.cos(7*Math.PI/4), y+r*Math.sin(7*Math.PI/4),r/3,n-1);
		auxCircle(x+r*Math.cos(8*Math.PI/4), y+r*Math.sin(8*Math.PI/4),r/3,n-1);
	}
}
