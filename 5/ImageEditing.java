/*
*Assignment number :5.1
*File Name : ImageEditing.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/
public class ImageEditing {
		
	public static void main(String args[]) {
		test();
	}
	/**
	 * this method is meant to test all others.
	 */
	public static void test() {
		String fileName1 = "cake.ppm";
		String fileName2 = "tinypic.ppm";
		int [][][] openFile1 = read(fileName1);
		int [][][] openFile2 = read(fileName2);
		show(openFile1);
		print(openFile2);
		show(flipHorizontally(openFile1));
		show(flipVertically(openFile1));
		show(greyScale(openFile1));
		show(scale(openFile2,800,800));
		morph(openFile1,openFile2,20);
	}
	/**
	 * this method gets a files name and converts the information.
	 * it returns a matrix of pixels.
	 * @param filename.
	 * @return fileMatrix.
	 */
	public static int[][][] read(String filename){
		StdIn.setInput(filename);
		StdIn.readLine();
		int Width = StdIn.readInt();
		int Hight = StdIn.readInt();
		int [][][] fileMatrix;
		fileMatrix = new int[Hight][Width][3];
		StdIn.readInt();
		for (int i = 0; i < Hight; i++){
			for (int j = 0; j < Width; j++){
				fileMatrix[i][j][0] = StdIn.readInt();
				fileMatrix[i][j][1] = StdIn.readInt();
				fileMatrix[i][j][2] = StdIn.readInt();
			}
		}
		return fileMatrix;
	}
	/**
	 * gets a matrix of pixels.
	 * prints out the pixels.
	 * @param source
	 */
	private static void print(int[][][] source) {
		
		int N = source.length;    // number of rows.
		int M = source[0].length; // number of columns.
		for (int i = 0; i < N; i++) {
			   for (int j = 0; j < M; j++) {
				   StdOut.printf("%4d%4d%4d    ",source[i][j][0], 
						   source[i][j][1], source[i][j][2]);
			   }
			   StdOut.println();
		}
	}
	/**
	 * gets a matrix and gives back the mirror image.
	 * @param source
	 * @return ImageMatrix
	 */
	public static int[][][] flipHorizontally(int[][][] source){
		int N = source.length;    // number of rows.
		int M = source[0].length; // number of columns.
		int [][][] ImageMatrix;
		ImageMatrix = new int[N][M][3];
		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				ImageMatrix[i][j] = source[i][M-j-1];//copy the hole pixel
			}
		}
		return ImageMatrix;
	}
	/**
	 * gets a matrix and returns it up side down
	 * @param source
	 * @return VirticalMatrix
	 */
	public static int[][][] flipVertically(int[][][] source){
		int N = source.length;    // number of rows.
		int M = source[0].length; // number of columns.
		int [][][] VirticalMatrix;
		VirticalMatrix = new int[N][M][3];
		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				VirticalMatrix[i][j] = source[N-i-1][j];
			}
		}
		return VirticalMatrix;
	}
	/**
	 * gets a matrix and uses luminacnce method to make its 
	 * pixels in black and white.
	 * @param source
	 * @return GreyMatrix
	 */
	public static int[][][] greyScale(int[][][] source){
		int N = source.length;    // number of rows.
		int M = source[0].length; // number of columns.
		int [][][] GreyMatrix;
		GreyMatrix = new int[N][M][3];
		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				GreyMatrix[i][j] =  luminance(source[i][j]);
				}
			}
		return GreyMatrix;
	}
	/**
	 * gets a pixel and returns it in its grey shade.
	 * @param RGB
	 * @return grey
	 */
	public static int [] luminance (int [] RGB){
		int GreyVal = (int)(0.299 * RGB[0] + 0.587 * RGB[1] + 0.114 * RGB[2]);
		int [] grey = {GreyVal,GreyVal,GreyVal} ;
		return grey;
	}
	/**
	 * gets a matrix of pixels and returns it in a different size.  
	 * @param source
	 * @param width
	 * @param hight
	 * @return scaledIm
	 */
	public static int[][][] scale(int[][][] source, int width, int hight){
		int N = source.length;    // number of rows.
		int M = source[0].length; // number of columns.
		int [][][] scaledIm;
		scaledIm = new int [hight][width][3];
		for (int i = 0; i < hight; i++){
			for (int j = 0; j < width; j++){
				scaledIm[i][j] = source[i*N/hight][j*M/width];
				}
		}
		return scaledIm;
	}
	/**
	 * takes to pixels and returns them as a blended pixel of both of them 
	 * with the weight of alpha as a measure of dominance.
	 * @param pixel1
	 * @param pixel2
	 * @param alpha
	 * @return newPix
	 */
	public static int[] blend (int[] pixel1, int[] pixel2, double alpha){
		int [] newPix;
		newPix = new int[3];
		for ( int i = 0; i < 3; i++ ){
			newPix[i] = (int)(pixel1[i] * (1-alpha) + pixel2[i]*(alpha));
		}
		return newPix;
	}
	/**
	 * uses blend to combined to pictures in to one  
	 * with the weight of alpha as a measure of dominance.
	 * @param source1
	 * @param source2
	 * @param alpha
	 * @return ComboIm
	 */
	public static int[][][] combine
	(int[][][] source1, int[][][] source2, double alpha){
		int N = source1.length;    // number of rows.
		int M = source1[0].length; // number of columns.
		int [][][] ComboIm;
		ComboIm = new int [N][M][3];
		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				ComboIm[i][j] = blend(source1[i][j],source2[i][j],alpha);
			}
		}
		return ComboIm;
	}
	/**
	 * takes the source picture and blends it with the target
	 * in n moves such that we will have only the target at the end.
	 * @param source
	 * @param target
	 * @param n
	 */
	public static void morph (int[][][] source, int[][][] target, int n){
		int N = source.length;    // number of rows.
		int M = source[0].length; // number of columns.
		int K = target.length;    // number of rows.
		int L = target[0].length; // number of columns.
		if ((K!=N)||(M!=L)){
				target = scale(target,M,N);
			}
		for (int i = 0; i < n+1; i++){
			show(combine(source , target , ((double)i/n)));
			}
		}
	
	   /**
		* Renders an image using StdDraw. 
		* The input array is assumed to contain integers in the range [0,255].
		* With the third dimension being of size 3.
		*
		* @param pic - the image to show.
		*/
	public static void show(int[][][] pic){
		StdDraw.setCanvasSize(pic[0].length, pic.length);
		int height = pic.length;
		int width = pic[0].length;
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		StdDraw.show(30);
		for (int i = 0; i < height; i++){
		    for (int j = 0; j < width; j++){
				StdDraw.setPenColor(pic[i][j][0], pic[i][j][1], pic[i][j][2] );
				StdDraw.filledRectangle(j + 0.5, height - i - 0.5, 0.5, 0.5);
		    }
		}
		StdDraw.show();
	}
}