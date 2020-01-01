/*
Assignment number :3.6
File Name : FreqCalc.java.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class FreqCalc {   	
	public static void main(String[] args)  {
		// start an array of strings with the ABC.
		String[] letters ={"a:","b:","c:","d:","e:","f:","g:",
		"h:","i:","j:","k:","l:","m:","n:","o:","p:","q:","r:",
		"s:","t:","u:","v:","w:","x:","y:","z:"};
		//go throw the charecters one by one.
		for (int i=0 ;i<args[0].length() ;i++){
			for (int j=0;j<26; j++){
				// check if the charecter is in the ABC and add a star if so. 
				if ((args[0].charAt(i)) == (letters[j].charAt(0))||
				((args[0].charAt(i))+32 == (letters[j].charAt(0)))){
					letters[j]=letters[j]+"*";
					//found the latter so we can go to the next charecter.
					break;
					}
				}
			}
		//print the array.
		for (int i=0;i<26;i++){
			System.out.println(letters[i]);
		}
	}		
}