/*
Assignment number :2.4
File Name : BinAdd.java
Name (First Last) : Ilan Weiss
Student ID : 302634654
Email : ilan.weiss@post.idc.ac.il
*/

public class BinAdd{

	public static void main(String[] args) {
		/*get the binary numbers*/
		String num1 = args[0];
		String num2 = args[1];
		/*check length and see which is longer, 
		then make the other the same length by adding zero*/
		int len1=num1.length();
		int len2=num2.length();
		int max=len1;
		String sum="";
		if (len1>len2){
			for (int i = 0 ; i < (len1-len2);i++)
				num2= '0'+num2;
			}
			else if (len2>len1){
				max=len2;
				for (int i = 0 ; i < (len2-len1);i++)
				num1= '0'+num1;
			}
		/*make a flag in case we have an iligal input 
		and carry to carry our ones*/
		char carry='0';
		int flag=0;
		/*go over the numbers in the first binary number 
		and add to sum the digets needed*/
		for (int i=max-1;i>=0;i--){
			switch (num1.charAt(i)){
				case '1': if (((num2.charAt(i)=='1')&& (carry=='0'))||
						((num2.charAt(i)=='0')&& (carry=='1'))){
							sum ="0"+sum;
							carry='1';
						}
						else	
							sum=num1.charAt(i) + sum;
						break;
				case '0' : if (((num2.charAt(i)=='1')&& (carry=='0'))||
						((num2.charAt(i)=='0')&& (carry=='1'))){
							sum ="1"+sum;;
							carry='0';
						}
						else	
							sum=num1.charAt(i) + sum;
						break;
				default : flag=1;
				}
		}
		/*check if we still need to carry a one*/
		if (carry=='1')
			sum=carry+sum;
		/*make sure the secound num was a ligal input*/
		if (flag==0){
			for (int i=0;i<max;i++){
				if ((num2.charAt(i)!='1')&&(num2.charAt(i)!='0')){
					flag=1;
					break;
			}
		}
	}
	/*print result*/
	if (flag==1)
		System.out.println("illegal input");
		else
			System.out.println(sum);
		
	}
}
/*done*/