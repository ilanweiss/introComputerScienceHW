/*
*Assignment number :8.1
*File Name : Multiply.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/
public class Multiply {
	
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[1]);
		System.out.println(multiply(a,b));
	}
	/**
	 * gets two integers and returns there product.
	 * @param a
	 * @param b
	 * @return a*b
	 */
	public static int multiply(int a,int b){
		
		if (a==1)
			return b;
		return b + multiply(a-1,b);
	}
	
}
