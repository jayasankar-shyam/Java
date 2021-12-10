package hello;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		x=sc.nextInt();
		y =sc.nextInt();
		System.out.print("Before Swapping x="+x);
		System.out.println(",y ="+y);
	   x=x+y;
	   y=x-y;
	   x=x-y;
		System.out.print("After Swapping x="+x);
		System.out.println(",y ="+y);

	}

}
