package ExceptionDemos;

import java.util.*;
/*
 * 
 * At a time only one exception occurs and 
 * at a time only one catch block is executed.
 *  All catch blocks must be ordered 
 *  from most specific to most general,
 *   i.e. catch for
 *  ArithmeticException must come before 
 *  catch for Exception
 * 
 * */

public class Exception2 extends Exception{

	public static void main(String[]args){
			//part1
		int i=2;
		int j=0;
		int nums[]=new int[5];
		
		try{
			j=18/i;
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}
		
		catch(Exception e) {
			// System.out.println("Something went wrong"+e);
			 System.out.println("Denominator cannot be zero!"+e);
			 
		 }
		
		System.out.println("j="+j);
		
		//part2
		//int i=2;
		//int j=0;
		//int nums[]=new int[5];
		String str=null;
		try{
			j=18/i;
			System.out.println(str.length());
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}
		
		catch(ArithmeticException e) {
			// System.out.println("Something went wrong"+e);
			 System.out.println("Denominator cannot be zero!"+e);
			 
		 }
		catch(ArrayIndexOutOfBoundsException a) {
			 System.err.println("Index out of bounds");
			 
		 }
		catch(Exception e) {
			 System.err.println("exception");
			 e.printStackTrace();
		}
		
		System.out.println("j="+j);
		
		
		//part 3
		/*try {
				 String text = "text";
				 System.out.println(text.charAt(1));
				 int n = Integer.parseInt("abc");
			 } 
			 catch(IndexOutOfBoundsException e) {
				 System.err.println("Index out of bounds");
				 e.printStackTrace();
			 } 
			 catch(NumberFormatException e) {
				 System.err.println("bad number");
				 e.printStackTrace();
			 }
			 catch(Exception e) {
				 System.err.println("exception");
				 e.printStackTrace();
			 }*/


		System.out.println("Bye");
	}
}


 