package test_32;


public class test_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vc=new Vehicle[2];
		vc[0]=new Car(1234,45.6);
		vc[1]=new Plane(7);
		
		for(int i=0;i<vc.length;i++) {
			if(vc[i]instanceof Car)
				System.out.println("第"+i+"個物件是Car類別");
			else
				System.out.println("第"+i+"個物件是Plane類別");
		}
	}

}
abstract class Vehicle{		//父類別
	protected int speed;
	public void setSpeed(int s) {
		speed=s;
		System.out.println("將速度設為"+speed);
	}
	abstract void show();
}
class Car extends Vehicle{
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
		System.out.println("速度是"+speed);
	}
}
class Plane extends Vehicle{
	private int flight;
	
	public Plane(int f) {
		flight=f;
		System.out.println("生產了"+f+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}