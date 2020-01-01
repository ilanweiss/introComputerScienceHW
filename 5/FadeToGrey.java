/*
*Assignment number :5.4
*File Name : FadeToGrey.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/
/**
 * 	gets two command line arguments:
 *  the name of an input PPM file representing an image,
 *  and a number representing the desired number of fading steps.
 *	displays an animated stepwise view of how a colorful image fades into grey
 */
public class FadeToGrey {
	public static void main(String[] args) {
		String file = args[0];
		int moves = Integer.parseInt(args[1]);
		ImageEditing.morph((ImageEditing.read(file)), 
				(ImageEditing.greyScale(ImageEditing.read(file))), moves);
	}
}