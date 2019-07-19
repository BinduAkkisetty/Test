package JavaOopsConcept;

public class Bmw implements CarInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bmw b=new Bmw();
b.start();
b.stop();
b.remotekey();
b.model();
b.theftsecurity();
	}
	public void start(){
		System.out.println("start");
	}
	public void stop(){
		System.out.println("stop");
	}
	public void remotekey(){
		System.out.println("access alaram");
	}
public void model(){
	System.out.println("model number 2018");
}

public void theftsecurity(){
	System.out.println("alaram for security");
}
@Override
public void vehicletype(){
	System.out.println("type of vehicle");
}
@Override
public void wheels() {
	System.out.println("number of wheels ");
	
}
}
