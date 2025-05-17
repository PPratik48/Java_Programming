package Threading;

class Counter {
 int count;
 public synchronized void increment()
 {
	 count++;
 }
}

class A5 implements Runnable
{
	public void run(){
		for(int i=0;i<1000;i++) {
			
		}
	}
}

class B5 implements Runnable
{
	public void run(){
		for(int i=1;i<1000;i++) {
			
		}
	}
}

public class ThreadSafeDemo {
	public static void main(String[]args) throws InterruptedException{
		 
		Counter c= new Counter();
		Runnable obj1= ()->
		 {
			 for(int i=1;i<=1000;i++) {
					c.increment();
				}
		 };
		 Runnable obj2= ()->
		 {
			 for(int i=1;i<=1000;i++) {
					c.increment();
				}
		 };
		 
		 Thread t1 =new Thread(obj1);
		 Thread t2 =new Thread(obj2);
		 t1.start();
		 t2.start();
		 try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 t2.join();
		 
		System.out.println(c.count);
	}
	

}