package JavaOopsConcept;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("throw exception");
try{
 throw new Error("Bindu exception");
	}catch(Error e){
	System.out.println(e.getMessage());
	}
System.out.println("this is my program");
	}
}

