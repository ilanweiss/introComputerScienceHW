package week3codes;

public class MyMath {
	public static void main(String args[]) {

		// Tests the distance function​
		double d = distance(2,1,5,4);  // Computes distance between (2,1) and (5,4)​
		System.out.println("The Euclidian distance between (2,1) and (5,4)"
				+ " is: "+d); 
		
		System.out.println(sqrt(2, 0.1));        
		System.out.println(sqrt(2, 0.001));
		System.out.println(sqrt(2));

	}

	// Euclidian distance between (x1,x2) and (y1,y1)
	public static double distance(double x1, double y1, double x2, double y2) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		double dist = sqrt(dx*dx + dy*dy, 0.01);
		return dist;
	}

	// Square root of x with a given precision (epsilon)​
	public static double sqrt(double x, double epsilon) {
		if (x < 0) return Double.NaN;
		double r = x;
		while (Math.abs(r*r - x) > epsilon) {
			r = (x/r + r) / 2.0;
		}
		return r;
	}

	// Square root of x with default precision 0.001​
	public static double sqrt(double x) {
		return sqrt(x, 0.001);
	}
}
