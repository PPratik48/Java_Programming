package ExceptionDemos;

public class FinallyDemo {
	
	/*Sometimes, while in a try / catch block,
	 *  an Exception could be thrown before some 
	 * important code at the end of the try block 
	 * The finally block can be used to run this code
	 * Code in finally always executes 
	 * (even in case of unhandled exceptions)
	 * 
	 * */
    static void meth1() throws Exception
    {
        try
        {
            
        throw new Exception();
        }
        finally
        {
           //this message will definitely execute 
        System.out.println("Final Message");
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        meth1();
    }   
}
