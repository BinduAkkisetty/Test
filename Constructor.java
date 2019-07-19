package JavaOopsConcept;

public class Constructor {
	String Name;
	int age;
	
	public Constructor(){
		System.out.println("default constructor");
	}
	public Constructor(int j){
		System.out.println("single param cons");
		System.out.println(j);
	}
	public Constructor(int a,int b){
		System.out.println("two param con");
		System.out.println(a + ","+b);
		
	}
    public Constructor(String Name,int age){
    	this.Name=Name;
    	this.age=age;
    	
    }

	public static void main(String[] args) {
		Constructor b=new Constructor();
		Constructor b1=new Constructor(10);
		Constructor b2=new Constructor(10,20);
		Constructor b3=new Constructor("varshi",20);
System.out.println(b3.Name);
System.out.println(b3.age);
	}

}
