/*
*Assignment number :8.2
*File Name : GCD.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/
public class GCD {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[1]);
		System.out.println(gcd(a,b));
	}
	/**
	 * gets two integers and returns GCD
	 * 
	 */
	public static int gcd(int p,int q){
		if (p < q)
			return gcd(q,p);
		if (q == 0)
			return p;
		return gcd(q,p % q);	
	}
}
