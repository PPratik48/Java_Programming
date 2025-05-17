package Threading;

//Program to demonstrate Thread Priority and Thread.sleep()
class A3 extends Thread{
	public void run(){
		for(int i=0;i<50;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class B3 extends Thread{
	public void run(){
		for(int i=0;i<50;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo3 {
	public static void main(String[]args){
		 A3 obj1=new A3();
		 B3 obj2=new B3(); 
		//System.out.println("Priority="+obj2.getPriority());
		obj2.setPriority(Thread.MAX_PRIORITY);
		 obj1.start();
		 obj2.start();
		
	}

}