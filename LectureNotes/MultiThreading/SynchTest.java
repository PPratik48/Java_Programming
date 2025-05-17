package Threading;

public class SynchTest {
     synchronized void drawpattern(char ch,int rows)
     {
	     for (int i = 1; i <= rows; i++) {
	         // Print * i times
	         for (int j = 1; j <= i; j++) {
	             System.out.print(ch);
	         }
	         // Move to the next line
	         System.out.println();
	     }
     }
}

class A extends Thread
{
	SynchTest p;
	A(SynchTest p)
	{
		this.p=p;
	}
	public void run()
	{
		p.drawpattern('*', 5);
	}
}

class B extends Thread
{
	SynchTest p;
	B(SynchTest p)
	{
		this.p=p;
	}
	public void run()
	{
		p.drawpattern('#', 5);
	}
}

class SychTest
{
	
	public static void main(String args[]) {
		SynchTest pobj=new SynchTest();
		A threadA=new A(pobj);
		B threadB=new B(pobj);
		threadA.start();
		threadB.start();
	}
}
