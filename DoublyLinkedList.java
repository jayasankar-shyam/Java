package hello;
import java.util.*;
public class DoublyLinkedList 
  {
	public static void main(String[] args)
	{
	 List<Integer> no=new LinkedList<>();
	 no.add(3);
	 no.add(7);
	 no.add(9);
	 no.add(13);
	 no.add(17);
	 System.out.println("List : " + no);
	 int num=no.get(1);
	 System.out.println("Element to be removed : "+num);
	 int index= no.indexOf(7);
	 System.out.println("Position of  is "+(index+1));
	 int removedNumber = no.remove(1);
	 System.out.println("Removed Element: "+removedNumber);
	 System.out.println("List : "+no);
	}
  }
