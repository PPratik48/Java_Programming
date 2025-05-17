package Threading;

//Parallel Execution 
class A2 extends Thread{
	public void run(){
		for(int i=0;i<100;i++) {
			System.out.println("Hi");
		}
	}
}
class B2 extends Thread{
	public void run(){
		for(int i=0;i<100;i++) {
			System.out.println("Hello");
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[]args){
		 long startTime = System.currentTimeMillis();
		 long startTime1 = System.nanoTime();
		 A2 obj1=new A2();
		 B2 obj2=new B2(); 
		 obj1.start();
		 obj2.start();
		 long endTime = System.currentTimeMillis();
		 long endTime1 = System.nanoTime();
		 long timeDifference = endTime - startTime;
		 long timeDifference1 = endTime1 - startTime1;
		 System.out.println("Time difference: " + timeDifference + " milliseconds");
		 System.out.println("Time difference: " + timeDifference1 + " nanoseconds");
		 
}

}