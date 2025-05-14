package ExceptionDemos;


/*
 * A User Defined Exception must be a 
 * subclass of Exception or one of its subclasses
 * 
 * */

class NegDimException extends Exception{// RuntimeException{
	public String toString(){
		return "Dimension Negative!";
	}
}
class ZeroDimException extends Exception{
	String mes;	
	ZeroDimException(String s){
			super(s);
			this.mes=s;
	}
	public String getMessage(){
			return "ZeroDimException:"+mes;
	}
}

class Rectangle{
	double l,b;
	Rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	double area() throws NegDimException,ZeroDimException{
		if(l<0 || b<0)
			throw new NegDimException();
		if(l==0||b==0)
			throw new ZeroDimException("Zero Dimension!!");
		return l*b;
	}


}
class TestExceptionRect{
	public static void main(String args[]) {//throws NegDimException{
		
		Rectangle r=new Rectangle(3.5,4.7);
		Rectangle r1=new Rectangle(3.5,0);
		try{
			System.out.println("Area="+r.area());
			System.out.println("Area="+r1.area());
		}catch(NegDimException e){
			System.out.println(e);
		}
		catch(ZeroDimException e){
			System.out.println(e.getMessage());
		}
	}
}
