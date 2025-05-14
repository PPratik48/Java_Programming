package ExceptionDemos;

import java.util.*;
public class Exception1 {

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nr");
		int num=sc.nextInt();
		System.out.println("Enter Dr");
		int den=sc.nextInt();
		int result=0;
		///result=num/den;
		//System.out.println("result="+result);
		try{
			result=num/den;
		System.out.println("result="+result);
		}catch(Exception e){
			System.out.println("----------------");
			System.out.println(e);
			System.out.println("----------------");
			e.printStackTrace();
			System.out.println("----------------");
			System.out.println("Denominator cannot be zero!");
			System.out.println("----------------");
			System.out.println(e.getMessage());
		}
		System.out.println("result="+result);
		System.out.println("Bye");
	}
}