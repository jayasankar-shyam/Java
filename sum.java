package hello;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		
		int x,y,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		x=sc.nextInt();
		y =sc.nextInt();
		s=x+y;
		System.out.println("The Sum is "+s);
	}

}
