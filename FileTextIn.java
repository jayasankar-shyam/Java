package java_pgms;
import java.io.*;
import java.util.*;
public class FileTextIn {
  public static void main(String[] args)throws IOException {
		
        File f=new File("mytext.txt");
        Scanner sc =new Scanner(System.in);
        if(f.exists())
		{
			System.out.println("exist");
		}else
		{
			f.createNewFile();
			System.out.println("file created");
			
		}
        try {
        	FileWriter f1=new FileWriter("mytext.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter data");
			String s=br.readLine();
			f1.write(s);
			System.out.println("content added");
			f1.close();
		    br.close();
		}
		catch(Exception e) {
			System.out.println("File not found");
	}
       
       FileReader fout=new FileReader("mytext.txt");
       int i;
       while((i=fout.read())!=-1)
       {
    	   char c=(char)i;
		   System.out.print(c);
       }fout.close();
  }
  
}