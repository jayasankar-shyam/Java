package java_pgms;
import java.io.*;
import java.util.Scanner;
class MultiTable
{
	void print(int n)
	{
		synchronized(this) {
			 for (int i = 1; i <= 3; i++)
			 {
				 System.out.println(n + "*"+i+ "="+(i * n));
				 try {
					 Thread.sleep(100);
				 }catch(Exception e) {
					 System.out.println(e);
				  }
			 }
		}
	 }
}
class Tab extends Thread
{
	MultiTable t;
	int n;
	Tab(MultiTable tab,int num)
	{
		t=tab;
		n=num;
	}
	 public void run()
	 {
		t.print(n); 
	 }
}
public class Multithreading1
{
 public static void main(String args[]){
	 int num;
	 MultiTable multi=new MultiTable();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Table you want to run by Thread 1");
	 num=sc.nextInt();
	 Tab t1=new Tab(multi,num);
	 System.out.println("Enter the Table you want to run by Thread 2");
	 num=sc.nextInt();
	 Tab t2=new Tab(multi,num);
	 System.out.println("Enter the Table you want to run by Thread 3");
	 num=sc.nextInt();
	 Tab t3=new Tab(multi,num);
	 t1.run();
	 t2.run();
	 t3.run();
	 sc.close();
 }
}