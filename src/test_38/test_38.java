package test_38;


public class test_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVehicle[] ivc;
		ivc=new iVehicle[2];
		
		ivc[0]=new Car(1234,56.6);
		ivc[1]=new Plane(878);
		
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}

}
interface iVehicle{		//父類別
	int weight=1000;
	abstract void show();
}
class Car implements iVehicle{
	private int num;
	private double gas;
	
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("車號是"+num+"，油量是"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("油量是"+gas);
	}
}
class Plane implements iVehicle{
	private int flight;
	
	public Plane(int f) {
		flight=f;
		System.out.println("生產了"+f+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
	}
}