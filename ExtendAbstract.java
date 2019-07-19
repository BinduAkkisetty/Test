package JavaOopsConcept;

public class ExtendAbstract extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendAbstract e=new ExtendAbstract();
		e.Sum();
	    e.test();
	    e.mul(10);
	    
	 //   AbstractClass ab=new AbstractClass();
	    
	}

	@Override
	public void Sum() {
		int a = 10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	public void test(){
		System.out.println("test");
	}

}
