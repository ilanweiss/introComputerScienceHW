/*
*Assignment number :5.2
*File Name : Editor1.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/
/**
 * gets two command line parameters: 
 * the name of a PPM file, followed by one of the operation codes
 *  fh, fv,or gr. 
 *  The program displays in it a new image which is either
 *  the horizontally fliped, vertically fliped, or greyscaled 
 *  version of the original image.
 */
public class Editor1 {
	public static void main(String[] args) {
		String file = args[0];
		String opperation = args[1];
		int [][][] Image = null;
		switch (opperation){
		case "fh" : Image = ImageEditing.flipHorizontally(ImageEditing.read(file));
					break;
		case "fv" : Image = ImageEditing.flipVertically(ImageEditing.read(file));
					break;
		case "gr" : Image = ImageEditing.greyScale(ImageEditing.read(file));
					break;	
		}
		ImageEditing.show(Image);
	}
}
