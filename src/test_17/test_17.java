package test_17;


public class test_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars[];
		cars=new Car[2];
		
		cars[0]=new Car();
		cars[0].setCar(1234, 20.4);
		
		cars[1]=new RacingCar();
		cars[1].setCar(5634, 67.4);
		
		for(int i=0;i<cars.length;i++) {
			cars[i].show();
		}
	}

}
class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("create a car");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("設車號為"+num+"，油量為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("油量是"+gas);
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
		System.out.println("set racingcar number"+course);
	}
	public void show() {
		System.out.println("賽車車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
