package hello;
class b extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class a  extends Thread{
	public void run() {
		for(char i='a';i<='e';i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
public class Multithreading2 {
	public static void main(String[] args) {
			a at=new a();
			b bt=new b();
			try {
			    at.start();
			    bt.start();
			    at.join();
			    bt.join();
		   }
		    catch(Exception e) {
			   System.out.println(e);
		   }
	}
}
