package hello;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		int i,c=0,len;
		char ch;
		String word;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word : ");
		word=scan.next();
		System.out.println("Enter a character to check : ");
		ch=scan.next().charAt(0);
		len=word.length();
		for(i=0;i<len;i++)
		{
			if(word.charAt(i)==ch)
				c++;
		}
		System.out.println(ch+" repeats for "+c+" times");
	}
}
