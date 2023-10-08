/*
o/p
enter an string :
a3b2
ab5
*/


package Strings;

import java.util.Scanner;

public class AddDigitPresentString {
	static String sumstringint(String s) {
		String newstr="";
		int sum=0;
		//for digits
		for( int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				// to add the ASCII values 
				// sum=sum+(int) s.charAt(i)-48;
				sum=sum +(s.charAt(i)-48);
			}else {
				newstr=newstr +s.charAt(i);
			}	
		}	
		newstr=newstr+sum;//Concatenation(joining)
		return newstr;  // or newstr+sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an string : ");
		String s=sc.nextLine();
		System.out.println(sumstringint(s));
		sc.close();
	}
}
