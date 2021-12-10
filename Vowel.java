package hello;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		char l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter : ");
		l=sc.next().charAt(0);
		if(l=='a'||l=='e'||l=='i'||l=='o'||l=='u'||l=='A'||l=='E'||l=='I'||l=='O'||l=='U')
		{
			System.out.println("The letter '"+l+"' is a vowel");
		}
		else
			System.out.println("The letter '"+l+"' is a consonant");

	}

}
