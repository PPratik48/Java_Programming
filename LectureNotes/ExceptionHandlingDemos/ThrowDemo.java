package ExceptionDemos;

public class ThrowDemo {
	public static void main(String[]args){
	int i=20;
	int j=0;
	
	try{
		j=18/i;
	//	if(j==0)
			//call catch();
		//	throw new ArithmeticException();
		// throw  new ArithmeticException("I dont want j to be zero");
	}
	
	catch(ArithmeticException a) {
		j=18/1;
		System.out.println("this is the default output!");
		
		 
	 } 
	catch(Exception e) {
		 System.err.println("exception");
		 e.printStackTrace();
	}
	
	System.out.println("j="+j);
	}
}
