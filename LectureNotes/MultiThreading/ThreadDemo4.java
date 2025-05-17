package Threading;

//Program to demonstrate Runnable Interface

class Z {
	
}

//class A4 extends Z, Thread
class A4 implements Runnable
//class A4 extends Thread

{
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) 
				e.printStackTrace();
			}
		}
	}

class B4 implements Runnable
{
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo4 {
	public static void main(String[]args){
		/* A4 obj1=new A4();  //thread
		 B4 obj2=new B4();  //thread
		 obj1.start();
		 obj2.start();*/
		 
		 A4 obj1=new A4();  //interface Runnable
		 B4 obj2=new B4();  //interface Runnable
		/* Runnable obj1=new A4();  //interface Runnable
		 Runnable obj2=new B4();  //interface Runnable
		 */
		 Thread t1 =new Thread(obj1);
		 Thread t2 =new Thread(obj2);
		 t1.start();
		 t2.start();
		
	}
	

}