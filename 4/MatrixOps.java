/*
*Assignment number :4.1
*File Name : MatrixOps.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/

/** A library of operations on two-dimensional matrices. */

public class MatrixOps {
	
	public static void main(String args[]) {
		
		test();
		
		int[][] a = { 
					    { 7, 2, 1 },
					    { 3, 6, 1 },
					    { 5, 1, 4 },
					 };
		
		int[][] b = { 
					    { 8, 3, 5 },
					    { 1, 4, 1 },
					    { 1, 3, 4 },
					 }; 
				
		print(a);          System.out.println();
		print(b);          System.out.println();
		print(add(a,b));   System.out.println();
		print(mult(a,b));  System.out.println();
				
		// c = a * (a + b).
		int[][] c = mult(a,add(a,b));
		print(c);          System.out.println();
	}	
	
	/**
	 *  Prints the given matrix.
	 *  
	 *  @param the matrix to be printed.
	 */
	public static void print(int[][] m) {
		
		int N = m.length;    // number of rows.
		int M = m[0].length; // number of columns.
		for (int i = 0; i < N; i++) {
			   for (int j = 0; j < M; j++) {
				   System.out.printf("%7s",m[i][j] + " ");
			   }
			   System.out.println();
		}
	}

	/**
	 * Adds the two given matrices. Assumes that they have the same dimensions.
	 * 
	 * @param m1 - first summand
	 * @param m2 - second summand
	 * @return the sum of the two matrices
	 */
	public static int[][] add(int[][] m1, int[][] m2) {
		int N = m1.length;    // number of rows.
		int M = m1[0].length; // number of columns.
		int[][] sum = new int[N][M];
		for (int i = 0; i < N; i++) {
		   for (int j = 0; j < M; j++) {
		      sum[i][j] = m1[i][j] + m2[i][j];
		   }
		}
		return sum;
	}
	
	/**
	 * Checks if the given matrix is symmetric.
	 * 
	 * @param m - the matrix to be tested.
	 * @return true if and only if the matrix is symmetric.
	 */
	public static boolean isSymmetric(int[][] m) {
		int N = m.length;    // number of rows.
		int M = m[0].length; // number of columns.
		if( N != M ){	//if the matrix isn't square it can't be symmetric.
			return false;
		}
		for (int i = 0; i < N; i++) {
			   for (int j = 0; j < N; j++) {
				 if ( m[i][j] != m[j][i] ){// if it Aij!=Aji it isn't symmetric. 
					 return false;
				 }
			   }
		}
		return true;
	}
	
	/**
	 * Checks if the two given matrices are equal.
	 * 
	 * @param m1 
	 * @param m2
	 * @return true if and only if m1 equals m2.
	 */
	public static boolean equals(int[][] m1, int[][] m2) {
		int N1 = m1.length;    // number of rows in first matrix.
		int M1 = m1[0].length; // number of columns in first matrix.
		int N2 = m2.length;    // number of rows in second matrix.
		int M2 = m2[0].length; // number of columns in second matrix.
		//if the two matrices haven't the same MxN they arn't equal.
		if (( M1 != M2 ) || ( N1 != N2 )){ 
			return false;
		}
		for (int i = 0; i < N1; i++) {
			for (int j = 0; j < M1; j++) {
				if ( m1[i][j] != m2[i][j] ){// if Aij!=Bij -> A!=B.
					return false;
				 }
			}
		}
		return true;
	}

	/**
	 * Creates and returns an identity matrix of size N.
	 * 
	 * @param N - the size of the identity matrix.
	 * @return the identity matrix of size N
	 */
	public static int[][] identity(int N) {
		int[][] IdMat;
		IdMat = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if ( i==j ){//identity matrix {Aii=1, Aij=0|i!=j}.
					IdMat[i][j] = 1;
					}
				else{
					IdMat[i][j] = 0;
					}
				}
			}
		return IdMat; 
	}	
		
	/**
	 * Creates and returns the transpose of the given matrix.
	 * 
	 * @param m - the given matrix.
	 * @return a new matrix, which is the transpose of m.
	 */
	public static int[][] transpose(int[][] m) {
		int N = m.length;    // number of rows in matrix.
		int M = m[0].length; // number of columns in matrix.
		int [][] TranMat;
		TranMat = new int[M][N];//rows and columns change.
		for (int i = 0; i < M; i++) {
			   for (int j = 0; j < N; j++) {
				   TranMat[i][j] = m[j][i];//(A^t)ij=(A)ji.
			   }
		}
	   return TranMat;  
	}

	/**
	 * Computes and returns the product of the two given matrices.
	 * 
	 * @param m1
	 * @param m2
	 * @return the product of m1 and m2
	 */
	public static int[][] mult(int[][] m1, int[][] m2) {
		int N = m1.length;    // number of rows in matrix.
		int M = m2[0].length; // number of columns in matrix.
		int [][] MultMat;
		MultMat = new int [N][M];
		for (int i = 0; i < N; i++) {
			   for (int j = 0; j < M; j++) {
				   for ( int k = 0; k<M; k++){
					   MultMat[i][j] = MultMat[i][j] + (m1[i][k] * m2[k][j]);
					   //(A*B)ij = sum(Aik*Bkj) while k runs from 1....M.
				   }
			   }
		}			  
		return MultMat;
	}

	/** The method creates and returns a matrix of N rows and M columns,
	* 
	* @param N - number of rows in wanted matrix.
	* @param M - number of columns in wanted matrix.
	* @param range - the range of integers in each place (0,range).
	* @return mat - a new random matrix.
	*/
	public static int[][] random(int N,int M,int range ) {
		int[][]  mat;
		mat = new int[N][M];
		for (int i = 0; i < N; i++) {
			   for (int j = 0; j < M; j++) {
				   mat[i][j] = (int)(Math.random() * range);
				   //puts random numbers in the matrix (0,range)
			   }
		}
	   return mat;  
	}
	
	/** Given: a matrix m and two coordinates specified by the integers 
 	*i1, j1, i2, and j2. The method returns a matrix which is the subset
	*of m. The top-left element of the subset is m(i1,j1), and the bottom-right
	*element is m(i2,j2).
	*
	*@param m - given matrix.
	* @param i1 
	* @param j1
	* @param i2 
	* @param j2  
	* @return mat - a new sub matrix.
	*/
	public static int[][] subMatrix(int [][] m,int i1,int j1,int i2, int j2 ) {
		int[][]  mat;
		mat = new int[i2 - i1 + 1][j2 - j1 + 1];//build a new sub matrix.
		for ( int i = i1 ; i <= i2 ; i++ ) {
			   for ( int j = j1 ; j <=j2 ; j++ ) {
				   mat[i - i1][j - j1] = m[i][j];
				   /*put in the first place in the new matrix
				    * the number in the first index given and
				    *  run till the last index given A(i1,j1)....A(i2,j2).
				    */
			   }
		}
	   return mat;  
	}
	
	/**
	 * Create a square matrix and a random matrix.
	 * test the matrix library with a few test methods.
	 */
	private static void test() {
		
		int randRange = (int)(Math.random() * 20000);
		int randRows = (int)(Math.random() * 50 + 1);
		int randCol = (int)(Math.random() * 50 + 1);
		int [][] randMat = random(randRows, randCol, randRange);
		int [][] sqrMat = random(randRows, randRows, randRange);
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

		if ( isSymmetric( add( mat, transpose(mat) ) ) ){ 
			print( add ( mat, transpose(mat) ) );	System.out.println();
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

		int [][] equMat1 = mult( mat, identity( N ) );
		int [][] equMat2 = mult(( identity( N ) ), mat);
		if (( equals( mat, equMat1 ) ) && ( equals( equMat2, equMat2) ) ){
			System.out.println("yabadabadu!equals, mult & identity works!");	
		}
		else
		{
			print(mat); 		System.out.println("shit");
			print(equMat1);		System.out.println("whats not right?");
			print(equMat2);
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
		print(mat);		System.out.println();
		System.out.println("first index: (" + (Math.min(i1, i2) + 1) + 
				"," + (Math.min(j1, j2) + 1) + ")\nseacound index: (" +
				(Math.max(i1, i2)+1) + "," + (Math.max(j1, j2) + 1) + ")\n");
		return subMatrix (mat, Math.min(i1, i2), Math.min(j1, j2),
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
		print(mat);		System.out.println();
		print(mult(transpose(mat),identity(mat.length)));
	}
}