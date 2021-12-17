package hello;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		int len,i;
		String word,rev ="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word : ");
		word=sc.next();
		len=word.length();
		for(i=len-1;i>=0;i--)
			rev=rev+word.charAt(i);
		if(rev.equals(word))
			System.out.println("The word "+word+" is a palindrome");
		else
			System.out.println("The word "+word+" is not a palindrome");
	}

}
