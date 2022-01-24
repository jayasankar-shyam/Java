package java_pgms;
import java.util.Scanner;
public class TryCatchThrow
{
    public static int divide(int first,int second)throws ArithmeticException
        {
            return first/second;
        }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int firstNumber,secondNumber;
        System.out.print("Enter the first no: ");
        firstNumber=sc.nextInt();
        System.out.print("Enter the second no: ");
        secondNumber=sc.nextInt();
        try
        {
            System.out.println("Result="+ divide(firstNumber,secondNumber));
            
        }
        catch(ArithmeticException e)
        {
          System.out.println(e.getMessage());   
        }
         

    }
}