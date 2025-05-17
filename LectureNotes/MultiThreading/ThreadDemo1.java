package Threading;
//Sequential Program Execution
class A1 {
	public void show()	{
		for(int i=0;i<100;i++){
			System.out.println("Hi");
		}
	}
}
class B1{
	public void show(){
		for(int i=0;i<100;i++){
			System.out.println("Hello");
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[]args){
		 long startTime = System.currentTimeMillis();
		 long startTime1 = System.nanoTime();
		 A1 obj1=new A1();
		 B1 obj2=new B1();
		 obj1.show();
		 obj2.show();
		 long endTime = System.currentTimeMillis();
		 long endTime1 = System.nanoTime();
		 long timeDifference = endTime - startTime;
		 long timeDifference1 = endTime1 - startTime1;
		 System.out.println("Time difference: " + timeDifference + " milliseconds");
		 System.out.println("Time difference: " + timeDifference1 + " nanoseconds");
}

}