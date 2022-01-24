package java_pgms;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        int a,b,div;
        char ch = 'y';
        Scanner sc = new Scanner(System.in);
        while(ch == 'y') {
            System.out.print("Enter the first no: ");
            a = sc.nextInt();
            System.out.print("Enter the second no: ");
            b = sc.nextInt();
            try {
                div = a/b;
                System.out.println("Result: "+div);
            }
            catch (Exception e) {
                    System.out.println("Div by zero not allowed");
            }
            finally
            {
                System.out.println("End of Operatrion");   
            }
        
            System.out.print("\nDo you wanna continue (y/n)");
            ch = sc.next().charAt(0);
        }

    }
}