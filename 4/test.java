/**
 * Create a square matrix and a random matrix.
 * test the matrix library with a few test methods.
 */
public class test {
	
	private static void main() {
		
		int randRange = (int)(Math.random() * 20000);
		int randRows = (int)(Math.random() * 50 + 1);
		int randCol = (int)(Math.random() * 50 + 1);
		int [][] randMat = MatrixOps.random(randRows, randCol, randRange);
		int [][] sqrMat = MatrixOps.random(randRows, randRows, randRange);
		//Generate randomness to test matrix library.
		testSym(sqrMat);						System.out.println();
		testEqu(sqrMat, randRows);				System.out.println();
		randMat = testSub(randMat, randRows, randCol);
												System.out.println();
		testTran(randMat);						System.out.println();
	}
	
	/**
	 * gets a a square matrix.
	 * checks if A+A^t is a symmetric matrix.
	 * if so print it, the methods works :).
	 * if not print that something went wrong.
	 * @param mat
	 */
	private static void testSym(int [][] mat) {

		if (MatrixOps.isSymmetric
				(MatrixOps.add( mat, MatrixOps.transpose(mat)))){ 
			MatrixOps.print(MatrixOps.add (mat, MatrixOps.transpose(mat)));	
			System.out.println();
			System.out.println
			("is symmetric, great it works! an so does trans and add!");
		}
		else{
			System.out.println("not symmetric, shit! what went wrong?");
		}
	}

	/**
	 * gets a a square matrix, and the number of rows.
	 * checks if AI=IA=A.
	 * if so print a message that the methods works :).
	 * if not print the matrixes so we can see what went wrong.
	 * 
	 * @param mat
	 * @param N
	 */
	private static void testEqu(int [][] mat,int N) {

		int [][] equMat1 = MatrixOps.mult( mat, MatrixOps.identity( N ) );
		int [][] equMat2 = MatrixOps.mult(( MatrixOps.identity( N ) ), mat);
		if (( MatrixOps.equals( mat, equMat1 ) ) && ( MatrixOps.equals( equMat2, equMat2) ) ){
			System.out.println("yabadabadu!equals, mult & identity works!");	
		}
		else
		{
			MatrixOps.print(mat); 			
			System.out.println("shit");
			MatrixOps.print(equMat1);		
			System.out.println("whats not right?");
			MatrixOps.print(equMat2);
		}
	}
	
	/**
	 * gets matrix and its amount of rows and columns.
	 * Generates two random indexes, print the given matrix.
	 * prints the indexes and return the sub matrix.
	 * @param mat
	 * @param N
	 * @param M
	 * @return the sub matrix.
	 */
	private static int[][] testSub(int [][] mat, int N, int M) {

		int i1 = (int)(Math.random() * N );
		int i2 = (int)(Math.random() * N );
		int j1 = (int)(Math.random() * M );
		int j2 = (int)(Math.random() * M );
		MatrixOps.print(mat);		System.out.println();
		System.out.println("first index: (" + (Math.min(i1, i2) + 1) + 
				"," + (Math.min(j1, j2) + 1) + ")\nseacound index: (" +
				(Math.max(i1, i2)+1) + "," + (Math.max(j1, j2) + 1) + ")\n");
		return MatrixOps.subMatrix (mat, Math.min(i1, i2), Math.min(j1, j2),
				Math.max(i1, i2), Math.max(j1, j2));
	}
	/**
	 * checks the transpose method and 
	 * identity method on a non squared matrix.
	 * prints matrix subA and subA^t*I.
	 * 
	 * @param mat
	 */
	private static void testTran(int[][] mat){
		MatrixOps.print(mat);		
		System.out.println();
		MatrixOps.print
		(MatrixOps.mult(MatrixOps.transpose(mat),MatrixOps.identity(mat.length)));
	}
}


