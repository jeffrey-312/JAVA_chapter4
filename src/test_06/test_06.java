package test_06;

public class test_06 {
	public static void main(String[] args) {
		RacingCar rccar1=new RacingCar(1234,20.5,3);
		Car rccar2 = new Car(1234,20.5);
		
	}

}
class Car{
	private int num;
	private double gas;
	
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
	public RacingCar(int n,double g,int c) {
		super(n,g);
		course=c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
}









