package java_pgms;
import java.util.Scanner;
class method
{
    void calcarea(float base,float height)
    {
        double area=0.5*base*height;
        System.out.print("Area of Triangle with base "+base+" and height "+height+" is: "+area);
        System.out.print("\n");
    }
    void calcarea(int width,int length)
    {
        int area=width*length;
        System.out.print("Area of Rectangle with width "+width+" and length "+length+" is: "+area);
        System.out.print("\n");
    }
    void calcarea(float r)
    {
        double area=3.14*r*r;
        System.out.print("Area of Circle with radius "+r+" is: "+area);
        System.out.print("\n");
        
    }
}
public class methodOverloading
{
    public static void main(String[] args)
    {
        int w,h;
        float b,trih,r;
        method ob=new method();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Base of the Triangle\n");
        b=sc.nextFloat();
        System.out.print("Enter the Height of the Triangle\n");
        trih=sc.nextFloat();
        System.out.print("Enter the width of the Rectangle\n");
        w=sc.nextInt();
        System.out.print("Enter the Height of the Rectangle\n");
        h=sc.nextInt();
        System.out.print("Enter the Radius of the Circle\n");
        r=sc.nextFloat();
        ob.calcarea(w,h);
        ob.calcarea(b,trih);
       
        ob.calcarea(r);
    }
}
    
