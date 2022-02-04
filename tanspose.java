package java_pgms;

import java.util.Scanner;

public class tanspose {

	public static void main(String[] args) {
		int i,j,r,c;
		int mat[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the elements of the matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				mat[i][j]=sc.nextInt();
		}
		System.out.println("Original Matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				System.out.print(mat[i][j]+"\t");
			System.out.println();
		}
		System.out.println("Transpose Matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				System.out.print(mat[j][i]+"\t");
			System.out.println();
		}
		

	}

}
