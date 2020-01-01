/*
*Assignment number :5.3
*File Name : Editor2.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/
/**
 * 	gets three command line arguments:
 *  a PPM file name, representing some image.
 *  the desired width.
 *  the desired height.
 *  The program scales it to the specified dimensions, 
 *  and displays the result.
 */
public class Editor2 {
	public static void main(String[] args) {
		String file = args[0];
		int width = Integer.parseInt(args[1]);
		int hight = Integer.parseInt(args[2]);
		int [][][] Image;
		Image = ImageEditing.read(file);
		ImageEditing.show(ImageEditing.scale(Image, width, hight));
	}
}
