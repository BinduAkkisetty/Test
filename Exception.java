package JavaOopsConcept;

public class Exception {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
Exception e=new Exception();
e.div();
	}
public void div(){
	try{	
	int a=9/0;
	System.out.println(a);
	}
	catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}finally{
	System.out.println("abc");
}
}
}