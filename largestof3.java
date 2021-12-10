package hello;
import java.util.Scanner;
public class largestOf3 {

	public static void main(String[] args) {
		int x,y,z;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 numbers  : ");
		x=scan.nextInt();
		y=scan.nextInt();
		z=scan.nextInt();
		if(x>=y && x>=z)
			System.out.println("The largest number is "+x);
		else if(y>=x && y>=z)
			System.out.println("The largest number is "+y);
		else 
			System.out.println("The largest number is "+z);
		}
	}


