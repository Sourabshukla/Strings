/*

i/p-ASDF1245!@#$asfd
o/p-
uppercase 4
lowercase 4
digits 4
special 4

*/

package Strings;
import java.util.*;
public class CountAll {
	static String countDigit(String s) {
		String newstr="";
		int i ;
		int upper=0;
		int lower=0;
		int special=0;
		int digit=0;
		for( i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				upper++;
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				lower++;
			}else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				digit++;
			}else {
				special++;
			}
		}
		System.out.println("uppercase " +upper);
		System.out.println("lowercase " +lower);
		System.out.println("digits " +digit);
		System.out.println("special " +special);

		
		return newstr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an String");
		String s=sc.nextLine();
		System.out.println(countDigit(s));
		
		sc.close();
	}
}
