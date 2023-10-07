/*
 * enter an String
ASdfGhJ
original string : ASdfGhJ
Swapped String :asDFgHj
 */

package Strings;
import java.util.Scanner;
public class SwapCaseAlphabet {
	static String swapcase(String s) {
		String newstr="";
		for(int i=0;i<=s.length()-1;i++) {
			//capital letters
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				newstr=newstr+(char)(s.charAt(i)+32);
				//small letters
			}else if (s.charAt(i)>=90 && s.charAt(i)<=122) {
				newstr=newstr+(char)(s.charAt(i)-32);

			}//other than alphabets
			else {
				System.out.println("invalid input");
			}
		}
		return newstr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an String");
		String s=sc.nextLine();
		System.out.println("original string : "+s);
		System.out.println("Swapped String :" +swapcase(s));
		sc.close();
	}
}
