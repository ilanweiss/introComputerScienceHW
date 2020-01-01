
public class invers {
		/**
		 * Inverts all the colors of an image
		 * 
		 * @param pic
		 * @return the inverted image
		 */
		public static int[][][] invertAll(int[][][] pic){
			pic = invertColor(pic, 0);
			pic = invertColor(pic, 1);
			pic = invertColor(pic, 2);
			return pic;
		}
		
		/**
		 * inverts one color of an image.
		 * 
		 * @param pic
		 * @param color - the color to be inverted
		 * @return the inverted image
		 */
		public static int[][][] invertColor(int[][][] pic, int color){
			int[][][] ans = new int[pic.length][pic[0].length][3];
			for (int i = 0; i < ans.length; i++) {
				for (int j = 0; j < ans[0].length; j++) {
					ans[i][j] = invertPixel(pic[i][j], color);
				}
			}
			return ans;
		}
		
		
		/**
		 * invert one color of a given pixel.
		 * 
		 * 
		 * @param pixel
		 * @param color - the color to be inverted
		 * @return - the inverted pixel
		 */
		public static int[] invertPixel(int[] pixel, int color){
			int[] ans = {pixel[0], pixel[1], pixel[2]};
			ans[color] = 255 - pixel[color];
			return ans;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		/**
		 * Inverts all the colors of an image
		 * Changes the original image.
		 * 
		 * @param pic
		 * @return the inverted image
		 */
		public static int[][][] invertAll2(int[][][] pic){
			invertColor2(pic, 0);
			invertColor2(pic, 1);
			invertColor2(pic, 2);
			return pic;
		}
		
		
		/**
		 * inverts one color of an image.
		 * changes the original image.
		 * 
		 * @param pic
		 * @param color - the color to be inverted
		 * @return the inverted image
		 */
		public static void invertColor2(int[][][] pic, int color){
			for (int i = 0; i < pic.length; i++) {
				for (int j = 0; j < pic[0].length; j++) {
					invertPixel2(pic[i][j], color);
				}
			}
		}
		
		
		/**
		 * invert one color of a given pixel.
		 * changes the original pixel.
		 * 
		 * @param pixel
		 * @param color - the color to be inverted
		 * @return - the inverted pixel
		 */
		public static void invertPixel2(int[] pixel, int color){
			pixel[color] = 255 - pixel[color];
		}
	}

