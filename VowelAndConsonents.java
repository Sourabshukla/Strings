/*
enter an String 
aeiou
vowels : aeiou and vowels used :5
consonents :  and consonents used :0

*/
package Strings;

import java.util.Scanner;

public class VowelAndConsonents {
	static void vowelconsonent(String s) {
		int vowelcount=0;
		int consonentscount=0;
		String vowel="";
		String consonent="";
		for(int i=0;i<s.length();i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowel += s.charAt(i);
					vowelcount++;
				} else {
					consonent += s.charAt(i);
					
					consonentscount++;
				}
			}
		}System.out.println("vowels : "+vowel +" and vowels used :"+vowelcount);
		System.out.println("consonents : "+consonent +" and consonents used :"+consonentscount );
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter an String ");
			String s=sc.nextLine();
			vowelconsonent(s);
			sc.close();
		}
	}	
