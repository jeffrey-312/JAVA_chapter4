package test_09;

public class test_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar rccar1=new RacingCar();
		
		rccar1.newShow();
	}

}
class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("create car");
	}
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("create車號為"+num+"油量為"+gas);
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("set車號為"+num+"油量為"+gas);
	}
	
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("油量為"+gas);
	}
	
}
class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course=0;
		System.out.println("create a racingcar");
	}

	public void setCourse(int c) {
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void newShow() {
		System.out.println("車號是"+num);
		System.out.println("油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}





