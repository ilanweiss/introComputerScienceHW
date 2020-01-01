/*
Assignment number :3.5
File Name : FindFirstRepeat.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class FindFirstRepeat {   	
	public static void main(String[] args)  {
		int[] arr;
		arr=new int[args.length];
		//gets the integers and put them in an array.
		for (int i=0;i<args.length;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		for (int i=0 ;i<args.length ;i++){
			for (int j=i+1;j<args.length; j++){
				//check if there are repeating elements.
				if (arr[i]==arr[j]){
					System.out.println("First repeating element is " + arr[i]);
					return;
					}
				}
			}
		//if we reach this the are no repiting elements.
		System.out.println("No repeating elements");
		}		
}