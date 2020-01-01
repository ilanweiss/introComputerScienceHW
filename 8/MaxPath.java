/*
*Assignment number :8.3
*File Name : MaxPath.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/

public class MaxPath {

	public static void main(String[] args) {
		int rows = Integer.parseInt(args[0]);//amount of rows in matrix
		int col = Integer.parseInt(args[1]);//amount of columns 
		int [][] a;
		int count=2;
		a = new int [rows][col];
		for (int i = 0 ; i < rows; i++){
			for (int j = 0 ; j < col; j++){
				a[i][j] = Integer.parseInt(args[count]);
				count++;
			}
		}
		System.out.println(maxPath(a));
	}
	/**
	 * finds the maximal path using helper method
	 * @param arr
	 * @return the sum of the maximal path.
	 */
	public static int maxPath(int [][] arr){
		return helper(arr, 0 , 0);
	}			
	/**
	 * a recursive method  checks which way to go to receive the maximal path
	 * @param arr
	 * @param i
	 * @param j
	 * @return the sum of the maximal path.
	 */
	public static int helper(int [][] arr, int i, int j){
		if (( i == arr.length - 1 ) && (j ==  arr[0].length - 1))
			return arr[i][j];
		if (i == arr.length - 1 )
			return arr[i][j] + helper(arr, i, j + 1);
		if (j == arr[0].length - 1)
			return arr[i][j] + helper(arr, i + 1, j);
		return arr[i][j] + Math.max(helper(arr, i + 1, j), helper(arr, i, j + 1));
	}
	/**
	 * saves the maximal path of each sub path in array
	 * and returns the sum of the maximal path 
	 * @param arr
	 * @return
	 */
	public static int effMaxPath(int [][] arr){
		int [][] memo;
		memo = new int [arr.length][arr[0].length];
		return effMaxPath(arr,memo,arr.length-1,arr[0].length-1);
	}
	/**
	 * 
	 * @param arr
	 * @param memo
	 * @param i
	 * @param j
	 * @return the maximal path at the first place in the array (0,0).
	 */
	public static int effMaxPath(int [][] arr, int [][] memo, int i, int j){
		if (memo[i][j]!=0)
			return memo[i][j];
		memo[i][j] = helper(arr,i,j);
		if (( i == 0) && (j ==  0))
			return memo[i][j];
		if (i == 0 )
			return effMaxPath(arr,memo,i,j-1);
		if (j == 0 )
			return effMaxPath(arr,memo,i-1,arr[0].length-1);
		return effMaxPath(arr,memo,i,j-1);
	}

}
